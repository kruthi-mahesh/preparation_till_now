#include <stdio.h>
#define SWAP(a,b,c) c t;\
				t = *a;\
				*a = *b;\
				*b = t;
int main(int argc, char const *argv[])
{
	float x = 10,y=20;
	float *p,*q;
	p = &x;
	q = &y;
	SWAP(p,q,float);
	printf("%f %f %f %f\n",x,y, *p, *q );
	return 0;
}