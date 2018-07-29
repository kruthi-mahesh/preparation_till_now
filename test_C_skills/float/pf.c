#include  <stdio.h>
#define f1 0.8
#define f2 0.7
int main(int argc, char const *argv[])
{
	float a;
	scanf("%f",&a);
	printf("%f\n",a + a + a );
	printf("%f\n", 3*a);
	if(a+ a + a == 3*a)
		printf("equal\n");
	return 0;
}