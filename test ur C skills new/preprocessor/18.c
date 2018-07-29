#include <stdio.h>
#define JOIN(s1,s2) printf("%s = %s %s = %s\n",#s1,s1,#s2,s2 );
int main(int argc, char const *argv[])
{
	char *str1 = "kru";
	char * str2 = "pai";
//	printf("%s = %s %s = %s\n","str1",str1,str2,str2 );;
	JOIN(str1,str2);
	return 0;
}