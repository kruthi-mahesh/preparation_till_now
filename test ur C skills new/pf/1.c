#include <stdio.h>
int main(int argc, char const *argv[])
{
	int a = 9;
	char ch = printf("ab\t%d\n%d",a);
	char ch2 = printf("",a,a);
	printf("\n%d\n", ch2);
	return 0;
}