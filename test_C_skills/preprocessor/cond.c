#include <stdio.h>
#include "h.txt"
#define AND &&
#define ARANGE (a>25 && a<50)
#define RANGE(x) (x>20 AND x<500)

int main(int argc, char const *argv[])
{
	int a = 30;
	int b=34;
	if(ARANGE)
		printf("yes\n");;
	if(RANGE(b))
		printf("B\n");
	(a>20)?a:20;
	return 0;
}
