#include <stdio.h>
#define MESS Junk
#define INFINITELOOP while(1)
int main(int argc, char const *argv[])
{
	printf("MESS\\n\n" );
	INFINITELOOP
		printf("Kruthi \n");
	return 0;
}