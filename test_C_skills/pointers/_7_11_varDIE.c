#include <stdio.h>
int main(int argc, char const *argv[])
{
	int *j,*l;
	void fun(int **);
	fun(&j);
	fun(&l);
	printf("%d\n", *j);
	*l = 30;
	printf("%d\n",*j );
	return 0;
}
void fun(int **k)
{
	int a=10;
	*k = &a;
}