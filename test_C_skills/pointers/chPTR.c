#include <stdio.h>
int main(int argc, char const *argv[])
{
	int a[] = {1,2,3,4,5};
	char *p = (char *)a;
	char ch = *((int*)p+4);
	printf("%d\n",ch );

	 char *p2 = (int*)p;
	 ch = *(p2+16);

printf("%d\n",ch );
	return 0;
}