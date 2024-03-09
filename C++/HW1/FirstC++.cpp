#include <iostream>
#include <cstring>
using namespace std;
// . כתבו את המבנה Survivor . נתוני המבנה :
// i . שם השורד: מחרוזת סטטית בגודל 20 .
// ii . גי ל
// iii . סטטוס משפחתי )רווק/נשוי/במערכת יחסים (

enum eStatus
{
    SINGLE,
    MARRIED,
    IN_A_RELATIONSHIP
};
const char *status[] = {
    "Single",
    "Married",
    "In a relationship"};

struct Survivor
{
    char name[20];
    int age;
    eStatus status;
};

// כתבו את המבנה Tribe . נתוני המבנה :
// i . שם השבט: מחרוזת סטטית בגודל 20
// ii . מספר השורדים המקסימלית בשבט
// iii . מערך של מצביעים ל- Survivor
// iv . מספר השורדים שנשארו בשב ט

struct Tribe
{
    char name[20];
    int maxSurvs;
    int leftSurvs;
    // We have ** and not * because
    // we need to have a dynamic allocated pointer (?)
    // to an array of pointers
    Survivor *survivors[];
};

// כתבו את הפונקציות הגלובליות הבאות, בחלק מהמקרים עליכם להחליט מהם הפרמטרים
// שיתקבלו :
// i . אתחול: הפונקציה תקבל ref ל- Survivor ותקרא אליו נתונים מהמקלדת
// ii . פונקציה המדפיסה את נתוני השור ד

void setSurvivor(Survivor &surv);
void printSurvivor(Survivor &surv);

void setSurvivor(Survivor &surv)
{
    char nameBuff[20];
    int age;
    int stat;

    cout << "Please enter survivor name" << endl;
    cin >> nameBuff;
    strcpy(surv.name, nameBuff);

    cout << "Please enter survivor age" << endl;
    cin >> age;
    surv.age = age;

    cout << "Please enter survivor status: \n0 = " << status[0] << "\n1 = " << status[1] << "\n2 = " << status[2] << endl;
    cin >> stat;
    surv.status = (eStatus)stat;
}

void printSurvivor(Survivor &surv)
{
    if (surv.name)
        cout << surv.name << endl;
    if (surv.age)
        cout << surv.age << endl;
    if (surv.status >= 0 && surv.status <= 2)
        cout << status[surv.status] << endl;
}

// כתבו את הפונקציות הגלובליות הבאות, בחלק מהמקרים עליכם להחליט מהם הפרמטרים
// שיתקבלו :
// i . אתחול: הפונקציה תקבל ref ל- Tribe ותאתחל את נתוניו )ללא שורדים עדיין (
// ii . הוספת שורד לשבט ועדכון הנתונים הרלבנטיים
// iii . הדחה: תקבל שם של שורד ותשחרר את הקצאתו מהמערך, תצמצם את הרווח שנותר
// ותעדכן את מס פר השורדים שנותרו בשבט
// iv . הדפסת נתוני כל השורדים בשבט

void printSurvivors(Tribe &tribe);
void removeSurvivor(Tribe &tribe, Survivor &surv);
void addSurvivor(Tribe &tribe, Survivor &surv);
void setTribe(Tribe &tribe);

void setTribe(Tribe &tribe)
{

    char nameBuff[20];
    int maxSurvs;
    int leftSurvs;

    cout << "Please enter tribe name" << endl;
    cin >> nameBuff;
    strcpy(tribe.name, nameBuff);

    cout << "Please enter maximum survivors in tribe" << endl;
    cin >> maxSurvs;
    tribe.maxSurvs = maxSurvs;

    // cout << "Please enter amount of left survivors in tribe" << endl;
    // cin >> leftSurvs;
    // tribe.leftSurvs = leftSurvs;

    tribe.leftSurvs = maxSurvs;

    // cout << "Please enter survivor status: \n0 = " << status[0] << "\n1 = " << status[1] << "\n2 = " << status[2] << endl;
    // cin >> stat;
    // surv.status = (eStatus)stat;

    //   char name[20];
    // int maxSurvs;
    // int leftSurvs;
    // Survivor *survivors[];
}

void addSurvivor(Tribe &tribe, Survivor &surv)
{
    if (tribe.maxSurvs - tribe.leftSurvs > 0)
    {
        tribe.survivors[tribe.leftSurvs + 1] = &surv;
        tribe.leftSurvs++;
    }
}

void removeSurvivor(Tribe &tribe, Survivor &surv)
{
    if (tribe.survivors == nullptr)
        return;
    // const int survpointer = surv
    for (int i = 0; i < tribe.leftSurvs; i++)
    {
        Survivor *currSurv = tribe.survivors[i];
        if (strcmp(currSurv->name, surv.name) == 0)
        {
            delete currSurv;
            // Save the last survivor in the empty spot
            currSurv = tribe.survivors[tribe.leftSurvs - 1];
            tribe.leftSurvs--;
        }
    }
}

void printSurvivors(Tribe &tribe)
{
    for (int i = 0; i < tribe.leftSurvs; i++)
    {
        printSurvivor(*tribe.survivors[i]);
    }
}

// כתבו main :
// i . שאלו את המשתמש כמה שורדים יש בכל שבט
// ii . הגדירו 2 מערכים של מצביעים ל - Survivor בגודל המבוקש .
// iii . קראו נתונים בלולאה לתוך 2 השבטים עד אשר המשתמש יבחר להפסיק או עד אשר
// לא יהיה מקום לשורדים נוספים .
// iv . הדפיסו את נתוני 2 השבטים
// v . שחררו זיכרו ן

int main()
{
    // cout << "How many survivors are in each tribe?" << endl;
    // int survsCount;
    // cin >> survsCount;

    // The code below will not work
    // because we need to dynamically allocate memory
    // Survivor *tribe1[survsCount];
    // Survivor *tribe2[survsCount];

    // Survivor **tribe1 = new Survivor *[survsCount];
    // Survivor **tribe2 = new Survivor *[survsCount];

    Tribe *allTribes[2];

    for (Tribe *tribe : allTribes)
    {
        setTribe(*tribe);
    }
    // Tribe **tribe1 = new Tribe *[survsCount];
    // Tribe **tribe2 = new Tribe *[survsCount];
    bool isCont = true;
    int count = 1;
    do
    {
        cout << "Select 1 to enter survivor " << count + 1 << " stats in tribe 1. \nChoose 0 to exit" << endl;
        int select;
        cin >> select;
        if (!select)
            break;
        Survivor *s = new Survivor;
        setSurvivor(*s);
        addSurvivor(*allTribes[0], *s);
        // TO FIX ////////////////////
        // *tribe1[i]

        cout << "Select 1 to enter survivor " << count + 1 << " stats in tribe 2. \nChoose 0 to exit" << endl;
        cin >> select;
        if (!select)
            break;
        // FIX HERE TOO /////////////////////
        setSurvivor(*s);
        addSurvivor(*allTribes[1], *s);

        count++;

    } while (isCont && allTribes[0]->leftSurvs < allTribes[0]->maxSurvs && allTribes[1]->leftSurvs < allTribes[1]->maxSurvs);

    cout << "All tribes:" << endl;

    for (int i = 0; i < 2; i++)
    {
        cout << "Tribe " << i << ": " << endl;
        printSurvivors(*allTribes[i]);
    }

    // Survivor *me = new Survivor;
    // setSurvivor(*me);
    // printSurvivor(*me);

    // Free allocated memory
    delete[] allTribes[0];
    delete[] allTribes[1];
}
// int main()
// {
//     cout << "How many survivors are in each tribe?" << endl;
//     int survsCount;
//     cin >> survsCount;

//     // The code below ill not work
//     // because we need to dynamically allocate memory
//     // Survivor *tribe1[survsCount];
//     // Survivor *tribe2[survsCount];

//     Survivor **tribe1 = new Survivor *[survsCount];
//     Survivor **tribe2 = new Survivor *[survsCount];

//     int counts[2] = {0, 0};
//     for (int i = 0; i < survsCount; i++)
//     {
//         int select;
//         cout << "Select 1 to enter survivor " << i + 1 << " stats in tribe 1. \nChoose 0 to exit" << endl;
//         cin >> select;
//         if (!select)
//             break;
//         Survivor *s = new Survivor;
//         setSurvivor(*s);
//         // TO FIX ////////////////////
//         // *tribe1[i]
//         counts[0]++;

//         cout << "Select 1 to enter survivor " << i + 1 << " stats in tribe 2. \nChoose 0 to exit" << endl;
//         cin >> select;
//         if (!select)
//             break;
//         // FIX HERE TOO /////////////////////
//         setSurvivor(*tribe2[i]);
//         counts[1]++;
//         // cout << "Choose 1 to exit. Choose 1 to add survivor."
//         // cout << "What is "
//         // tribe1[i] =
//     }

//     for (int i = 0; i < survsCount; i++)
//     {
//         if (counts[0] < i && counts[1] < i)
//             break;
//         if (counts[0] >= i)
//         {
//             cout << "Survivor " << i << " stats in tribe 1:" << endl;
//             printSurvivor(*tribe1[i]);
//         }
//         if (counts[1] >= i)
//         {
//             cout << "Survivor " << i << " stats in tribe 2:" << endl;
//             printSurvivor(*tribe2[i]);
//         }
//     }

//     // Survivor *me = new Survivor;
//     // setSurvivor(*me);
//     // printSurvivor(*me);

//     // Free allocated memory
//     delete[] tribe1;
//     delete[] tribe2;
// }