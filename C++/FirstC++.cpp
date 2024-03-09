#include <iostream>

enum eStatus {SINGLE, MARRIED, IN_A_RELATIONSHIP}
char *status[] = {'Single', 'Married', 'In a relationship'};

struct survivor {
    static char name[20];
    int age;
    char status;
};

int main()
{
    std::cout << "Hello World" << std::endl;
}