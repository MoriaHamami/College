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
    void init(char firstName[], char *lastName, long id, char *diagnosis);
    void print();
    void setId(long id);
    void setDiagnosis(char *diagnosis);
    const char *getFirstName();
    const char *getFamName();
    long getId();
    const char *getDiagnosis();
};