#include "Tribe.h"
#include <cstring>
#include <iostream>
#define MAX_NAME_LEN 20

Tribe::Tribe(const char* name, int maxSurvivors) {
    this->setName(name);
    this->maxSurvivors = maxSurvivors;
    this->survivors = new Survivor*[maxSurvivors];
    this->remainingSurvivors = 0;
}

Tribe::~Tribe() {
    for (int i = 0; i < remainingSurvivors; i++) {
        delete survivors[i];
    }
    delete[] survivors;
}

void Tribe::setName(const char* name) {
    char _name[MAX_NAME_LEN] = {'\0'};
    int size = strlen(name);

    if (size >= MAX_NAME_LEN) {
        do {
            std::cout << "Name is too long. Please enter a shorter name: " << std::endl;
            std::cin >> _name;
            size = strlen(_name);
        } while (size >= MAX_NAME_LEN);
    } else {
        strncpy_s(_name, MAX_NAME_LEN, name, size);
    }

    this->name = new char[size + 1];
    strncpy_s(this->name, size + 1, _name, size);
    this->name[size] = '\0';
}

void Tribe::addSurvivor(Survivor* survivor) {
    if (remainingSurvivors < maxSurvivors) {
        survivors[remainingSurvivors++] = survivor;
    }
}

void Tribe::eliminateSurvivor(const char* name) {
    for (int i = 0; i < remainingSurvivors; i++) {
        if (strcmp(survivors[i]->GetName(), name) == 0) {
            delete survivors[i];
            for (int j = i; j < remainingSurvivors - 1; j++) {
                survivors[j] = survivors[j + 1];
            }
            remainingSurvivors--;
            break;
        }
    }
}

void Tribe::printSurvivors() {
    std::cout << "Tribe: " << name << std::endl;
    for (int i = 0; i < remainingSurvivors; i++) {
        survivors[i]->print();
    }
}