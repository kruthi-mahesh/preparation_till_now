#include<stdio.h>
//#define steps 3
int countWays(int n,int is_double_step_taken)
{
	if(n<0)
		return 0;
	if(n == 0 || n==1)
		return 1;
	int c1 = countWays(n-1,is_double_step_taken);
	int c2 = countWays(n-2,is_double_step_taken);
	int c3 = 0;
	if(is_double_step_taken == 0)
	{
		 c3 = countWays(n-3,1);

	}
	return c1 + c2 + c3;
}
int main(int argc, char const *argv[])
{
	int n;
	scanf("%d",&n);
	printf("%d\n",countWays(n,0) );
	return 0;
}