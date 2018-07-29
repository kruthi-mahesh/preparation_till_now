#include  <stdio.h>
#define f1 2.2
#define f2 2.7

int main(int argc, char const *argv[])
{
	int a =  (int)(f1 + 0.5);
	int b = (int)f1;
	int c = (int)(f2+0.5);
	int d = (int)f2;
	printf("%d %d %d %d \n",a,b,c,d );

	return 0;
}