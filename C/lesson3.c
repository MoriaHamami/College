#include <stdio.h>

//return the number of digits
int Length(int num);

//return the digit in the "index" position - from the right
//IndexOf(1654, 2) = 6
int IndexOf(int number, int index);

//Checks if a number is palindrome
//976515679 is palindrome
//1 = true
//0 = false
//The function prints how many times it being called
int IsPalindrome(int number);

void lesson3()
{
	int num, idx;
	int digit;

	printf("Please enter a number and index\n");
	scanf_s("%d%d", &num, &idx);

	digit = IndexOf(num, idx);

	if (digit == -1)
		printf("invalid index\n");
	else
		printf("the digit in index %d of the number %d is %d\n", idx, num, digit);
	
	if (IsPalindrome(num))
		printf("\n%d is palindrom\n", num);
	else
		printf("\n%d is not palindrom\n", num);

}

int Length(int num)
{
	int len = 0;
	while (num > 0)
	{
		++len;
		num /= 10;
	}
	return len;
}

int IndexOf(int number, int index)
{
	int i;
	int len = Length(number);

	if (index < 0 || index >= len)
		return -1;

	for (i = 0; i < index; ++i)
		number /= 10;

	return number % 10;
}

int IsPalindrome(int number)
{
	int i = 0;
	int j = Length(number) - 1;

	for (; i < j; i++, j--)
	{
		if (IndexOf(number, i) != IndexOf(number, j))
			return 0;
	}

	return 1;
}

