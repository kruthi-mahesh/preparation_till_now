#include <stdio.h>
#define str(x) #x
#define Xstr(x) str(x)
#define oper multiply
int main(int argc, char const *argv[])
{
	char *opername = Xstr(oper);
	printf("%s\n",opername );
	return 0;
}