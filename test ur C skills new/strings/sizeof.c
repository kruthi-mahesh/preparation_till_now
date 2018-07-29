#include <stdio.h>
int main(int argc, char const *argv[])
{
	int val = 02;
	char s1[] = "kru";
	int ct2 =  printf("%s %lu %lu %lu %lu %lu %lu %lu %s %s %s\n","\0\0" sizeof(3.0), sizeof(3.0f),  sizeof(char),sizeof("3"),sizeof(""),sizeof("\0"),sizeof("\n"),"abc","\0","hi");
	int ct = printf("%d \b\n",val);
	printf("%d %d \n",ct,ct2 );




	return 0;
}