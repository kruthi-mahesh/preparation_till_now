#include <stdio.h>
int main(int argc, char const *argv[])
{
	int i=3;
	i=i++;
	printf("%d",i);
	i=2;
	printf("\n%d %d",++i,++i);
	return 0;
}