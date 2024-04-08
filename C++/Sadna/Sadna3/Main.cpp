#include <iostream>

#include "Integer.cpp"

using namespace std;

int main()
{
    std::cout << "Hello World!\n";

    Integer x(5);
    Integer y(6);

    Integer z = x + y; // Integer z(10);
    Integer a = x + 6;
    Integer b = 5 + y;
    cout << z.getValue() << endl;
    cout << a.getValue() << endl;
    cout << b.getValue() << endl;
    z = x - y;
    a = x - 6;
    cout << z.getValue() << endl;
    cout << a.getValue() << endl;
    z = x * y;
    a = x * 6;
    cout << z.getValue() << endl;
    cout << a.getValue() << endl;
    z = x / y;
    a = x / 6;
    cout << z.getValue() << endl;
    cout << a.getValue() << endl;

    bool c = x < y;
    cout << "5 < 6 is " << c << endl;
    bool d = x > y;
    cout << "5 > 6 is " << d << endl;
    bool e = x <= y;
    cout << "5 <= 6 is " << e << endl;
    bool f = x >= y;
    cout << "5 >= 6 is " << f << endl;
    bool h = x == y;
    cout << "5 == 6 is " << h << endl;
    bool i = x != y;
    cout << "5 != 6 is " << i << endl;
}
