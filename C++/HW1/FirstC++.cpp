#include <iostream>
#include <cstring>
using namespace std;

// . כתבו את המבנה Survivor . נתוני המבנה :
// i . שם השורד: מחרוזת סטטית בגודל 20 .
// ii . גי ל
// iii . סטטוס משפחתי )רווק/נשוי/במערכת יחסים (

const int NUM_OF_TRIBES = 2;

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
    int currNumOfSurvs;
    // We have ** and not * because
    // we need to have a dynamic allocated pointer 
    // to an array of pointers
    Survivor **survivors;
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
        cout << "\nName: " << surv.name;
    if (surv.age)
        cout << "\nAge: " << surv.age;
    if (surv.status >= 0 && surv.status <= 2)
        cout << "\nStatus: " << status[surv.status];
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
void freeTribe( Tribe& t );

void setTribe(Tribe &tribe)
{

    char nameBuff[20];
    int maxSurvs;

    cout << "Please enter tribe name: ";
    cin >> nameBuff;
    strcpy_s(tribe.name, nameBuff);

    cout << "Please enter maximum survivors in tribe: ";
    cin >> maxSurvs;
    tribe.maxSurvs = maxSurvs;

	tribe.survivors = new Survivor*[tribe.maxSurvs];
    tribe.currNumOfSurvs = 0;
}

void addSurvivor(Tribe &tribe, Survivor &surv)
{
    if (tribe.maxSurvs > tribe.currNumOfSurvs)
    {
        tribe.survivors[tribe.currNumOfSurvs] = &surv;
        tribe.currNumOfSurvs++;
    }
}

void removeSurvivor(Tribe &tribe, Survivor &surv)
{
    if (tribe.survivors == nullptr)
        return;
    // const int survpointer = surv
    for (int i = 0; i < tribe.currNumOfSurvs; i++)
    {
        Survivor *currSurv = tribe.survivors[i];
        if (strcmp(currSurv->name, surv.name) == 0)
        {
            delete currSurv;
            // Save the last survivor in the empty spot
            currSurv = tribe.survivors[tribe.currNumOfSurvs - 1];
            tribe.currNumOfSurvs--;
        }
    }
}

void printSurvivors(Tribe &tribe)
{
    for (int i = 0; i < tribe.currNumOfSurvs; i++)
    {
        printSurvivor(*tribe.survivors[i]);
    }
}

void freeTribe( Tribe& tribe )
{
	for( int i = 0; i < tribe.currNumOfSurvs; i++ )
		delete tribe.survivors[i];

	delete[]tribe.survivors;
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

    Tribe allTribes[NUM_OF_TRIBES];

    for (int i = 0; i < NUM_OF_TRIBES; i++)
    {
        setTribe(allTribes[i]);
    }

    bool isCont = true;
    int count = 1;
    do
    {
        cout << "Select 1 to add survivor #" << count << " to tribe 1. \nChoose 0 to exit: ";
        int select;
        cin >> select;
        if (!select){
            isCont = false;
            break;
        }
        Survivor *s1 = new Survivor;
        setSurvivor(*s1);
        addSurvivor(allTribes[0], *s1);

        cout << "Select 1 to enter survivor #" << count << " to tribe 2. \nChoose 0 to exit: ";
        cin >> select;
        if (!select){
            isCont = false;
            break;
        }
        Survivor *s2 = new Survivor;
        setSurvivor(*s2);
        addSurvivor(allTribes[1], *s2);

        count++;

    } while (isCont && allTribes[0].currNumOfSurvs < allTribes[0].maxSurvs && allTribes[1].currNumOfSurvs < allTribes[1].maxSurvs);

    cout << "\nAll tribes: "<< endl;

    for (int i = 0; i < 2; i++)
    {
        cout << "\nTribe #" << i << ": ";
        printSurvivors(allTribes[i]);
    }

    // Free allocated memory
	freeTribe( allTribes[0] );
	freeTribe( allTribes[1] );
}
