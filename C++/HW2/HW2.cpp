#include <iostream>
#include <cstring>
using namespace std;

class Patient
{
    char _lastName[20];
    char _firstName[20];
    long _id;
    char *_diagnosis;

public:
    void init(char firstName[], char *lastName, long id, char *diagnosis)
    {
        strcpy(_firstName, firstName);
        strcpy(_lastName, lastName);
        setId(id);
        setDiagnosis(diagnosis);
    }

    void print()
    {
        cout << "Patient first name: " << _firstName << endl;
        cout << "Patient last name: " << _lastName << endl;
        cout << "Patient id: " << _id << endl;
        cout << "Patient diagnosis: " << _diagnosis << endl;
    }

    void setId(long id)
    {
        _id = id;
    }

    void setDiagnosis(char *diagnosis)
    {
        _diagnosis = new char[strlen(diagnosis)];
        strcpy(_diagnosis, diagnosis);
    }

    const char *getFirstName()
    {
        return _firstName;
    }

    const char *getFamName()
    {
        return _lastName;
    }

    long getId()
    {
        return _id;
    }

    const char *getDiagnosis()
    {
        return _diagnosis;
    }
};

class Clinic
{
    char _cName[20];
    char _cAddress[20];
    Patient **_patients;
    int _patLength;

public:
    void init(char cName[], char cAddress[])
    {
        strcpy(_cName, cName);
        strcpy(_cAddress, cAddress);
        _patLength=0;
        _patients = new Patient *[_patLength];
    }
    void print()
    {
        cout << "Clinic name: " << _cName << endl;
        cout << "Clinic address: " << _cAddress << endl;
        cout << "Patients: " << endl;
        for (int i = 0; i < _patLength; i++)
        {
            cout << "Patient #" << i+1 << ": " << endl;
            (*_patients[i]).print();
        }
    }
    void addPatient(Patient *newP)
    {
        Patient **tempPatients = new Patient *[++_patLength];
        for (int i = 0; i < _patLength; i++)
        {
            tempPatients[i] = _patients[i];
        }
        tempPatients[_patLength - 1] = newP;
        _patients = tempPatients;
    }
    // DELETE DOESNT WORK
    void deleteAllPats(){
        for (int i = 0; i < _patLength; i++)
        {
            cout<<_patients[i]->getFirstName()<<endl;
            cout<<_patients[i]<<endl;
            cout<<i<<endl;
            // delete _patients[_patLength - i -1]->getDiagnosis();
            delete _patients[i];
        }
            // delete _patients++;
        delete []_patients;
        _patLength = 0;
    }
};

int main()
{
    char fName[20] = "Moria";
    char lName[20] = "Hamami";
    long id = 315464347;
    char diagnosis[30] = "The patient is so very sick.";
    Patient mori;
    mori.init(fName, lName, id, diagnosis);
    mori.print();

    char fName2[20] = "Saara";
    char lName2[20] = "Betzalel";
    long id2 = 290758435;
    char diagnosis2[] = "The patient is confused and believes he is a duck.";
    Patient saar;
    saar.init(fName2, lName2, id2, diagnosis2);
    saar.print();
    // int updatedId = mori.getId();
    // cout << "The updated id is: " << updatedId << endl;
    // mori.print();

    char cName[20] = "Asuta";
    char cAddress[20] = "Dror 7, Jerusalem";
    Clinic asuta;
    asuta.init(cName, cAddress);
    asuta.addPatient(&mori);
    asuta.addPatient(&saar);
    asuta.print();

    asuta.deleteAllPats();

    return 1;
}