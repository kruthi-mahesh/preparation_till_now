#include <stdio.h>
#define str(x) #x
#define oper multiply
int main(int argc, char const *argv[])
{
	char *opername = str(oper);
	printf("%s\n", opername);
	return 0;
}