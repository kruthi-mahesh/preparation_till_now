#include <stdio.h>
void f(int);
void (*foo)(float) = f;
int main(int argc, char const *argv[])
{
	foo(90.0);
	return 0;
}
void f(int a)
{
	printf("%d\n",a );
}