#include <stdio.h>
#define Null (void *)0
int main(int argc, char const *argv[])
{
	if(0==NULL)
		printf("here 1\n");
	int a=3,b;
	b=a+NULL;
	printf("%d %d\n%d %d %d %d\n%d\n ", b,NULL,sizeof(NULL),sizeof(""),sizeof(0),sizeof((char)0),sizeof(void *));
	return 0;
}