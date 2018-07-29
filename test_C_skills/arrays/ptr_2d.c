#include <stdio.h>
void fun(int(*ptr) [3])
{
	printf("fun\n");
	printf("%d\n",ptr[1][2]);

}

void fun2(int **ptr2)
{
	printf("fun2\n");
	printf("%d\n",ptr2[0][0]);
	printf("%d\n",ptr2[0][1]);
	printf("%d\n",ptr2[1][0]);
	printf("%d\n",ptr2[1][1]);
	printf("%d\n",ptr2[1][2]);
	printf("%d\n",ptr2[2][0]);
	printf("%d\n",ptr2[2][1]);
}

void fun3(int *ptr_ori,int len)
{
	int * ptr = ptr_ori;
	printf("fun3\n");
	for(int i=0; i<len;i++)
		printf("%d \n",ptr[i]);
	for(int i=0; i<len;i++)
		printf("\n%d", *ptr++ );
	ptr = ptr_ori;
	for(int i=0; i<len/2;i++)
		printf("\n%d %d\n",ptr[i],*ptr++);
	printf("\n");
}

void fun4(int a[][3])
{
	printf("\nfun4\n");
	printf("%d\n",a[1][0]);
}
void fun5(int *xyz [3])
{
	printf("fun5 see fun 1 for proper syntax\n");
	printf("%d\n",xyz[1][0]);

}
int main(int argc, char const *argv[])
{
	int p[4] = {5,6,7,8};
	
	int arr[][3]={{1,2,3},{4,5,6}};
	fun(arr);
	int *b = p;
	int *ar2[] = {b,b+1,b+2};
	fun2(ar2);
	//fun2(arr) ;//segmentation fault
	//int **p1 =arr;
	int ar3[] = {10,11,12,13,14,15};
	fun3(ar3,6);

	int **check = ar2;
	printf("%d %d %d  ",check[0][0],*check[1]++,*check[1]);
	printf(" \n%d ",*check[1]);
	
	fun4(arr);

	fun5(ar2); // wrong
	fun5(arr); //segmentation fault
	return 0;
}