#include "clinic.h"

void Clinic::init(char cName[], char cAddress[])
{
    strcpy(_cName, cName);
    strcpy(_cAddress, cAddress);
    _patLength = 0;
    _patients = new Patient *[_patLength];
}
void Clinic::print()
{
    cout << "Clinic name: " << _cName << endl;
    cout << "Clinic address: " << _cAddress << endl;
    cout << "Patients: " << endl;
    for (int i = 0; i < _patLength; i++)
    {
        cout << "Patient #" << i + 1 << ": " << endl;
        (*_patients[i]).print();
    }
}
void Clinic::addPatient(Patient *newP)
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
void Clinic::deleteAllPats()
{
    for (int i = 0; i < _patLength; i++)
    {
        cout << _patients[i]->getFirstName() << endl;
        cout << _patients[i] << endl;
        cout << i << endl;
        // delete _patients[_patLength - i -1]->getDiagnosis();
        delete _patients[i];
    }
    // delete _patients++;
    delete[] _patients;
    _patLength = 0;
}