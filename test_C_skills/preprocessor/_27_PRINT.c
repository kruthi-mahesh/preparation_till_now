#include <stdio.h>
#define PRINT(x,y,z) printf(#x" = %d "#y" = %d "#z" = %d\n",x,y,z )
int main(int argc, char const *argv[])
{
	int x=4,y=4,z=5;
	int a=1,b=2,c=3;
	PRINT(x,y,z);
	PRINT(a,b,c);
	return 0;
}