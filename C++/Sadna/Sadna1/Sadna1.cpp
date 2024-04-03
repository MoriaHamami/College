// CALCULATOR IN C++
#include <iostream>
using namespace std;

int add(int a, int b);
int mul(int a, int b);
int sub(int a, int b);

int add(int a, int b)
{
    return a + b;
}
int mul(int a, int b)
{
    return a * b;
}
int sub(int a, int b)
{
    return a - b;
}

int main(void)
{
    int a, b;
    char op;
    cout << "Hey, choose operation (+,-,*):" << endl;
    cin >> op;
    cout << "op is:" << op << endl;
    cout << "Choose the first number:" << endl;
    cin >> a;
    cout << "Choose the second number:" << endl;
    cin >> b;
    cout << a << op << b << "=";

    switch (op)
    {
    case '+':
        cout << add(a, b) << endl;
        break;
    case '-':
        cout << sub(a, b)<< endl;
        break;
    default:
        cout << mul(a, b)<< endl;
        break;
    }
    return 0;
}