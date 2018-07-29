#include <stdio.h>
#define DEBUG(var,fs) printf("DEBUG:"#var" = "#fs"\n",var )
int main(int argc, char const *argv[])
{
	int x=4;
	float y=3.14;
	char ch = 'A';

	DEBUG(x,%d);
	DEBUG(y,%f);
	DEBUG(ch,%c);
	return 0;
}