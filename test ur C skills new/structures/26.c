#include <stdio.h>
#pragma pack(1)
struct ex{
	char ch;
	int i;
	long int l;
}e1;
int main(int argc, char const *argv[])
{
	printf("%lu %lu\n",sizeof(e1),sizeof(long int) );
	return 0;
}