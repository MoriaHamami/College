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
        _patients = new Patient *[0];
    }
    void print()
    {
        cout << "Clinic name: " << _cName << endl;
        cout << "Clinic address: " << _cAddress << endl;
        cout << "Patients: " << _cAddress << endl;
        for (int i = 0; i < _patLength; i++)
        {
            cout << "Patient #" << i << ": " << endl;
            *(_patients[i]).print();
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
    void deleteAllPats(){
        for (int i = 0; i < _patLength; i++)
        {
            delete _patients[i];
        }
    }
};

int main()
{
    // char fName[20] = "Moria";
    // char lName[20] = "Hamami";
    // long id = 315464347;
    // char diagnosis[30] = "The patient is so very sick.";
    // Patient mori;
    // mori.init(fName, lName, id, diagnosis);
    // int updatedId = mori.getId();
    // cout << "The updated id is: " << updatedId << endl;
    // mori.print();

    char cName[20] = "Asuta";
    char cAddress[20] = "Dror 7, Jerusalem";
    Clinic asuta;
    asuta.init(cName, cAddress);
    asuta.print();

    return 1;
}