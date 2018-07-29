#include <stdio.h>
#define Xstr(x) str(x)
#define str(x) #x
#define str(x) #x"hi"

#define oper multiply
int main(int argc, char const *argv[])
{
	char *opername = Xstr(oper);
	printf("%s\n", opername);
	return 0;
}