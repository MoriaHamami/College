// #include <iostream>
// #include <cstring>
// using namespace std;
#include "patient.h"

class Clinic
{
    char _cName[20];
    char _cAddress[20];
    Patient **_patients;
    int _patLength;

public:
    void init(char cName[], char cAddress[]);
    void print();
    void addPatient(Patient *newP);
    void deleteAllPats();
};
