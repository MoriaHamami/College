#include <stdio.h>
#include <math.h>

void lesson4()
{
	int num1 = 5;
	int num2 = 6;
	int num3 = 9;
	printf("5/9 = %d\n", num1/num3);
	printf("5/9 is zero in many programming languages.");
	printf("8/9 = %d\n", num2/num2);

	printf("Array with 3 cells initialized with {0}:\n");
	int arr[3] = { 0 };
	for (int i = 0; i < 3; i++) {
		printf("%d ", arr[i]);
	}
	printf("\nArray with 3 cells initialized with {1,2}:\n");
	int arr2[3] = { 1,2 };
	for (int i = 0; i < 3; i++) {
		printf("%d ", arr2[i]);
	}	
	printf("\nArray with 3 cells initialized with {a,b}:\n");
	int arr3[3] = { 'a', 'b'};
	for (int i = 0; i < 3; i++) {
		printf("%c ", arr3[i]);
	}
	printf("\nArray initialized with less numbers than cells, will be added with zeroes in the end");
	printf("\nArray initialized with less characters than cells, will have empty cells in the end.");

}