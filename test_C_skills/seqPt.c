#include <stdio.h>
int main(int argc, char const *argv[])
{
	int i = 2;
	int j;
	j =  i++ * i++;
	printf("\n%d %d",i,j);
	return 0;
}