#include<stdio.h>
#define steps 7
int countWays(int n)
{
	if(n<0)
		return 0;
	if(n == 0)
		return 1;
	int c1 = countWays(n-1);
	int c2 = countWays(n-2);
	int c3 = countWays(n-3);
	return countWays(n-1)
		+ countWays(n-2)
			+ countWays(n-3);
}
int main(int argc, char const *argv[])
{
	int n;
	scanf("%d",&n);
	for(int i=0;i<=n;i++){
		printf("%d %d\n",i,countWays(i) );
	}
	return 0;
}