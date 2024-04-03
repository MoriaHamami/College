#include <iostream>
#include <cstring>
#include "Survivor.h"

#define MAX_NAME_LEN 20

Survivor::Survivor(const char* name, const unsigned int age, char status) {
    this->age = age;
    this->SetStatus(status);
    this->SetName(name);
}

void Survivor::SetAge(const unsigned int age) {
    this->age = age;
}

void Survivor::SetName(const char* name) {
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

void Survivor::SetStatus(const char status) {
	switch (status) {
		case 's':
			this->status = Single;
			break;
		case 'r':
			this->status = Relationship;
			break;
		case 'm':
			this->status = Marry;
			break;
		default:
			break;
    }
}

unsigned int Survivor::GetAge() {
    return this->age;
}

char* Survivor::GetName() {
    return this->name;
}

const char* Survivor::GetStatus() {
    switch (this->status) {
        case Marry:
            return "Marry";
        case Relationship:
            return "Relationship";
        case Single:
            return "Single";
    }
}

void Survivor::print() {
    std::cout << "Survivor name: " << this->GetName() << std::endl;
    std::cout << "Survivor age: " << this->GetAge() << std::endl;
    std::cout << "Survivor status: " << this->GetStatus() << std::endl;
}

Survivor::~Survivor() {
    delete[] this->name;
}
