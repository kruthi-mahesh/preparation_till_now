#include <stdio.h>
int main(int argc, char const *argv[])
{
	float a = 5.375;
	char *p;
	int i;
	p = (char* )&a;
	for(i=0;i<4;i++)
		printf("%2x ",(unsigned char)p[i] );
	return 0;
}