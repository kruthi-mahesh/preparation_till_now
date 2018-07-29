#include <stdio.h>
void trial(int *ptr,int n){
	int j=0;
	printf("%d %d\n",++j,++j);
	j=0;
	printf("%d %d %d\n",j++,j++,j++);
	j=0;
	printf("%d %d %d %d %d\n",j,j++,j,j++,j);
	j=0;
	printf("%d %d %d %d %d\n",j,++j,j,++j,j);
	j=0;
	printf("%d %d %d %d %d\n",j,++j,j,j++,j);
	j=0;
	printf("%d %d %d %d %d\n",j,j,j,j++,++j);
	j=0;
	printf("%d %d %d %d %d %d %d %d\n",j,++j,j,j++,j,j++,++j,j);
	/* come from right to left
	keep count ct = initial;-> ct=0;
	substitute ct for j++ and increment ct 
	For ++j increment ct and substitute j in the place of ++j
	-> j,j(ct=4),j,2(ct=3),j,1(write ct;then ct=2),j(ct=1),j
	now substitute j=ct in the place of j
	-> 4,4,4,4,2,4,1,4,4
	*/

	for(int i=0;i<n/2;i++)
		printf("\n%d %d %d %d %d %d %d %d\n",++i,ptr[++i],i++,ptr[i++],*ptr++,i++,i++,++i);
}
int main(int argc, char const *argv[])
{
	int a[] = {1,2,3,4,5,6,7};
	trial(a,5);
	return 0;
}