#include <stdio.h>
int main(int argc, char const *argv[])
{
	typedef struct EMP{
		char *n;
		int age;
	}emp;

	emp e1 = {"dravid",23};
	emp e2 = e1;
	emp* p1  = &e1;
	emp *p2 = &e2;
	if(p1 == p2)
	//if(e1==e2) error

		printf("equal\n");

	e2.age  = 45;
	printf("%s %d\n",e2.n,e2.age );
	return 0;
}