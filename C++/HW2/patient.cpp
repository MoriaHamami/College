#include "patient.h"

void Patient::init(char firstName[], char *lastName, long id, char *diagnosis)
{
    strcpy(_firstName, firstName);
    strcpy(_lastName, lastName);
    setId(id);
    setDiagnosis(diagnosis);
}

void Patient::print()
{
    cout << "Patient first name: " << _firstName << endl;
    cout << "Patient last name: " << _lastName << endl;
    cout << "Patient id: " << _id << endl;
    cout << "Patient diagnosis: " << _diagnosis << endl;
}

void Patient::setId(long id)
{
    _id = id;
}

void Patient::setDiagnosis(char *diagnosis)
{
    _diagnosis = new char[strlen(diagnosis)];
    strcpy(_diagnosis, diagnosis);
}

const char *Patient::getFirstName()
{
    return _firstName;
}

const char *Patient::getFamName()
{
    return _lastName;
}

long Patient::getId()
{
    return _id;
}

const char *Patient::getDiagnosis()
{
    return _diagnosis;
}