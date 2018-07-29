#include <stdio.h>
#define SWAP(a,b,c) c t;t=a;a=b;b=t;
int main(int argc, char const *argv[])
{
	int x,y;
	x=10;y=20;
	SWAP(x,y,int);
	printf("%d %d\n",x,y );
	return 0;
}