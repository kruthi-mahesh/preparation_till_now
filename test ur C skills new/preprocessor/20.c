#include <stdio.h>
#define X (4+Y)
#define Y (X + 3)
int main(int argc, char const *argv[])
{
	printf("%d\n",4*X + 2 );
	return 0;
}