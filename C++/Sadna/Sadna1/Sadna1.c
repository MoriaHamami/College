// CALCULATOR IN C
#include <stdio.h>

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
    printf("Hey, choose operation (+,-,*):\n");
    scanf_s("%c", &op);
    printf("op is: %c\n", op);
    printf("Choose the first number:\n");
    scanf_s("%d", &a);
    printf("Choose the second number:\n");
    scanf_s("%d", &b);
    printf("%d%c%d=", a, op, b);

    switch (op)
    {
    case '+':
        printf("%d", add(a, b));
        break;
    case '-':
        printf("%d", sub(a, b));
        break;
    default:
        printf("%d", mul(a, b));
        break;
    }
    return 0;
}