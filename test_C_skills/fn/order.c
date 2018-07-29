#include <stdio.h>
f1(int a,int b)
{
	return a + 1;
}

f2(int a,int b)
{
	return a + 2;
}

f3(int a,int b)
{
	return a + b;
}
int main(int argc, char const *argv[])
{
	int res = f1(2,3) * f2(4,5) / f3(1,2)  + f3(6,7);
	printf("%d\n", res);
	return 0;
}