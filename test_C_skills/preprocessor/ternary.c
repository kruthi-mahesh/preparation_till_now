#include <stdio.h>
#define MAX(a,b) (a>b?a:b)

int main(int argc, char const *argv[])
{
	int x;
	x = MAX(3+2,2+7);
	printf("%d\n",x );
	return 0;
}