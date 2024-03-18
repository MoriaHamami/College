#include "clinic.h"
// Notice we dont need the following line:
// #include "patient.h"

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

    char cName[20] = "Asuta";
    char cAddress[20] = "Dror 7, Jerusalem";
    Clinic asuta;
    asuta.init(cName, cAddress);
    asuta.addPatient(&mori);
    asuta.addPatient(&saar);
    asuta.print();

    // asuta.deleteAllPats();

    return 1;
}