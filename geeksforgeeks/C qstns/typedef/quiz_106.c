#include <stdio.h>
typedef int INT,*INTPTR,ONEDARR[10],TWODARR[10][10];

int main(int argc, char const *argv[])
{
	INT a;
	INTPTR p1= &a;
	ONEDARR a1;
	a1[19] = 23;
	printf("%d\n",a1[19] );
	return 0;
}