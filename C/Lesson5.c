#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

int myHeight = 0; 
int myCount = 2;

void lesson5()
{
	pid_t pid1;
	myHeight++;
	while (myHeight<2 && myCount >0)
	{
		pid1 = fork();
		if (pid1 == 0) {
			lesson5();
			exit(0);
		}
		else {
			wait(NULL);
			myCount--;
		}
	}
	printf("my pid is %d\n", getpid());

}