#include <stdio.h>
#define PRINT(int) printf(#int" = %d ",int)
int main(int argc, char const *argv[])
{
	int x=2,y=3,z=4;

	PRINT(x);
	PRINT(y);
	PRINT(z);
	printf("x"" = %d\n",x );
	return 0;
}