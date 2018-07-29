#include <stdio.h>
int main(int argc, char const *argv[])
{
	static int arr[] = {0,1,2,3,4};
	int *p[] = {arr,arr+1,arr+2,arr+3,arr+4};
	int **ptr = p;
	printf("ptr %u p %u arr %u sizeof %d 
		sizeof(int) %d\n",ptr,p,arr,sizeof(arr),sizeof(int**));
	*++ptr;
	
	printf("ptr %u p %u arr %u\n",ptr,p,arr);
	printf("ptr %u *p %u arr %u\n",ptr,*ptr,arr);
	printf("%d %d %d\n",ptr-p,*ptr-arr,**ptr );
	*ptr++;
	printf("ptr %u p %u\n",ptr,p);
	printf("%d %d %d\n",ptr-p,*ptr-arr,**ptr );
	*++ptr;
	printf("%d %d %d\n",ptr-p,*ptr-arr,**ptr );
	++*ptr;
	printf("%d %d %d\n",ptr-p,*ptr-arr,**ptr );
	return 0;
}