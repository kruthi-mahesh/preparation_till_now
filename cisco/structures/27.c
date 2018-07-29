#include <stdio.h>
struct p
{
	int x;
	char y;
	
};

typedef struct p* q*;
int main(int argc, char const *argv[])
{
	struct p p1[] = {12,92,3,94,5,96};
	q ptr1 = p1;
	printf("%d\n",ptr1->x );
	return 0;
}