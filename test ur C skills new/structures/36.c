#include <stdio.h>
int main(int argc, char const *argv[])
{
	typedef union a{
		int i;
		char ch[4];
	}z;
	//z u = {512};
	z u2  = {0,2};
	z u = {(0,2)};
	printf("%d %d %d %d %d %lu\n",u.i,u.ch[0],u.ch[1],u.ch[2],u.ch[3],sizeof(u) ); 
	return 0;
}