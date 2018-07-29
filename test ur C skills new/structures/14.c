#include <stdio.h>
int main(int argc, char const *argv[])
{
	struct value
	{
		int bit1 :1;
		int bit2 : 2;
		unsigned int bit3 : 2;
		unsigned int bit4 : 1;
	}bit = {1,2,2,1};
	printf("%lu\n",sizeof(bit) );
	printf("%d %d %d %d\n\n",bit.bit1,bit.bit2,bit.bit3,bit.bit4 );
	return 0;
}