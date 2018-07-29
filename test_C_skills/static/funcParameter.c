#include <stdio.h>
int *check(int i, int j)
{
	int *p,*q;
	p =  &i;
	q = &j;
	return q;
}
int main(int argc, char const *argv[])
{
	int *c;
	c = check(10,20);
	printf("%d\n",*c);
	return 0;
}