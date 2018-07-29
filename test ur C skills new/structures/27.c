#include <stdio.h>
int main(int argc, char const *argv[])
{
	struct bits
	{
		int i:32;
	}bit;

	printf("%lu\n",sizeof(bit) );
	return 0;
}