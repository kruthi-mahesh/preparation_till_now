#include <stdio.h>
int main(int argc, char const *argv[])
{
	union a{
		
		unsigned int i;
		char ch[2];
	} ;
	union a u;
	//u.i=512;
	u.ch[0] = 0;
	u.ch[1] = 2;
	u.ch[2] = 0;
	u.ch[3] = 0;
	u.ch[1] = 0;
//u.ch[1] = 0;
//	u.ch[1] = 0;
	printf("%lu %d %d\n",sizeof(u),u.ch[1],u.i );
	return 0;
}