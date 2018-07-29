#include <stdio.h>
void fun(int (*a)[2][3][4])
{
	printf("%d\n",a[0][0][0][0] );
}
void  fun2(int (*a)[])
{

}
int main(int argc, char const *argv[])
{
	int a,b,*ptr1,*ptr2;
	a= 5,b=6;
	ptr1 = &a;
	ptr2 = &b;
	*ptr2 = 7;
	ptr2 = ptr1;
	printf("%d %d %d %d\n",a,b,*ptr1,*ptr2 );

	int a1[2][3][4];   
	fun(&a1);
	int a2[2];
	fun2(&a2);
	return 0;
}