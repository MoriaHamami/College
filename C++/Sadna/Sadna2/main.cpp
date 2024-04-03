#include <iostream>
#include "Survivor.h"
#include "Tribe.h"

int main() {
    int numSurvivors;
    std::cout << "Enter the number of survivors in each tribe: ";
    std::cin >> numSurvivors;

    Tribe tribe1("Tribe 1", numSurvivors);
    Tribe tribe2("Tribe 2", numSurvivors);

    char choice;
    do {
		std::cout << "Enter survivor name: ";
		char name[50] = {'\0'};
		std::cin >> name;
		std::cout << "Enter survivor age: ";
		int age = 0;
		std::cin >> age;
		std::cout << "Enter survivor status(r/s/m):  ";
		char status;
		std::cin >> status;

        Survivor* survivor = new Survivor(name, age, status);
        survivor->init_from_user();

        std::cout << "Which tribe to add the survivor to? (1/2): ";
        int tribeChoice;
        std::cin >> tribeChoice;

        if (tribeChoice == 1) {
            tribe1.addSurvivor(survivor);
        } else {
            tribe2.addSurvivor(survivor);
        }

        std::cout << "Add another survivor? (y/n): ";
        std::cin >> choice;
    } while (std::tolower(choice) == 'y');

    tribe1.printSurvivors();
    tribe2.printSurvivors();

    char eliminateName[20];
    std::cout << "Enter the name of a survivor to eliminate from Tribe 1: ";
    std::cin >> eliminateName;
    tribe1.eliminateSurvivor(eliminateName);

    std::cout << "Enter the name of a survivor to eliminate from Tribe 2: ";
    std::cin >> eliminateName;
    tribe2.eliminateSurvivor(eliminateName);

    std::cout << "After elimination:" << std::endl;
    tribe1.printSurvivors();
    tribe2.printSurvivors();

    return 0;
}
