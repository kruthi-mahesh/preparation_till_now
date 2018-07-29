#include <stdio.h>
int main(int argc, char const *argv[])
{
	int a=10,*j;
	void *k;
	printf("%x %x %d %d\n",j,k ,*j,*(int*)k);
	j=k=&a;
	printf("%x %x %d %d\n",j,k ,*j,*((int*)k));
	j++;
	k++;
	//int *)k++;
	printf("%x %x %d %d\n",j,k ,*j,*(int*)k);
	return 0;
}