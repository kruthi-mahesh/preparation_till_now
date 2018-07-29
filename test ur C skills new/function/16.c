#include <stdio.h>
int fn(){}
int main()
{
	int *p;
	float f = 89.0;
	printf("%p\n%g\n",main, f );
	int (*m)() = main;
	(*main)();
	printf("%p\n", m);
	return 0;
}