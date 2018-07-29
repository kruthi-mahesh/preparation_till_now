#include  <stdio.h>
#define f1 0.8
#define f2 0.7
int main(int argc, char const *argv[])
{
	float a  =f1;
	if(a==f1)
		printf("equal\n");
	else if(a<f1)
		printf("less\n");
	else
		printf("%f > %lf  larger\n",a,f1);
	if(a==0.8f)
		printf("equal now\n");


	a  =f2;
	if(a==f2)
		printf("equal\n");
	else if(a<f2)
		printf("less\n");
	else
		printf("larger\n");
	if(a==0.7f)
		printf("equal now\n");
	return 0;
}