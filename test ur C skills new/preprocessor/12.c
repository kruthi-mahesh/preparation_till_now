#include <stdio.h>
#define FUN(i,j) i##j
int main(int argc, char const *argv[])
{
	int val1 = 10;
	int val12 = 20002;
	printf("%d\n", FUN(23,2));
	return 0;
}