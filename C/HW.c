#include <stdio.h>

void homework() {

	// HW p3 q5 //////////////////////////////////

	int num1, num2;
	char ch;
	float res;

	printf("Enter two numbers\n");
	scanf_s("%d%d", &num1, &num2);

	do {
		printf("Enter an operator\n");
		scanf_s("%c", &ch, 1);
		printf("num1 %d num2 %d char %c\n", num1, num2, ch);
	} while ((ch != '*') && (ch != '/') && (ch != '%') && (ch != '-') && (ch != '+'));

	switch (ch) {
		case '*':
			res = num1 * num2;
			break;
		case '+':
			res = num1 + num2;
			break;
		case '%':
			res = num1 % num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '/':
			res = (float)num1 / num2;
			break;
	}

	printf("res = %f\n", res);

	// HW p3 q1 //////////////////////////////////
	int loops = 0;

	printf("Enter number of loops to perform\n");
	scanf_s("%d", &loops);

	for (int i = 0; i < loops; i++) {
		printf("Hello Mavo in for loop\n");
	}

	int counter = loops;
	do {
		printf("Hello Mavo in do-while loop\n");
	} while (--counter);

	counter = loops;
	while (counter--) {
		printf("Hello Mavo in while loop\n");
	}

	// HW p3 q2 //////////////////////////////////
	int positiveNum, flag = 1;

	printf("Enter a positive number\n");
	scanf_s("%d", &positiveNum);

	if (positiveNum < 0) {
		printf("Number entered isn't positive\n");
	} else {
		int currDig, lastDig = -1;
		while (positiveNum) {
			currDig = positiveNum % 10;
			printf("Curr number = %d\n", currDig);
			if (lastDig >= currDig) flag = 0;
			lastDig = currDig;
			positiveNum /= 10;
		}
	}

	if (flag) {
		printf("Going down sequence\n");
	} else {
		printf("NOT going down sequence\n");
	}

	// HW p3 q4 //////////////////////////////////

	int x, y;

	printf("Enter x,y\n");
	scanf_s("%d,%d", &x, &y);

	for (int i = 0; i < x; i++) {
		if (i == 0 || i==(x-1)) {
			for (int j = 0; j < y; j++) {
				printf("*");
			}
			
		}
		else {
			printf("*");
			for (int j = 0; j < y-2; j++) {
				printf(" ");
			}
			printf("*");
		}
		
		printf("\n");
		
	}

}