#include <stdio.h>
void f3();	
int main(int argc, char const *argv[])
{
	
	void f2();
	
	void f1();

	int n = 8;
	f1();
	f2();
	return 0;
}

void f1()
{
	printf("f1\n");
	f3(4);
}

void f2()
{
	//f3(3);
	printf("f2\n");
}

void f3(int a){
	printf("f3%d\n",a);
}