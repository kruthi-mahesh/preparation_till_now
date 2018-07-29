#include <stdio.h>
#define MIN(x,y) (x>y)?x:y
int main(int argc, char const *argv[])
{
	int x=3,y=4,z;
	z = MIN(x+y/2,y-1);
	if(z>0)
		printf("%d\n",z );
	return 0;
}