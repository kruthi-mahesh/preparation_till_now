#include <stdio.h>
struct test{
/*
	char a1;
	long a2;
	char a3;*/
	int in;
	char data1;
	long a;

		/*char data4[2];
		char dtaa5;
	short data2;
	//int data3;*/

	
	//int k1;
	//char a[2];
	//long k;
	
	//char c:2;
	//char ch:2;

};
int main(int argc, char const *argv[])
{
	static b;
	static int a;
	static int func(int);
	extern int i;
	i=4;
	//#pragma pack(1)
	printf("%lu\n%d",sizeof(struct test) ,sizeof(b));
	
	return 0;
}
int i;
