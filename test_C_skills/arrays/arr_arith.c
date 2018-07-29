int main(int argc, char const *argv[])
{
	int arr[] = {1,2};
	printf("%u %u %u %u\n",arr,&arr,arr+1,&arr+1);
	int* _2d[] = {arr, arr+1,arr+2};
	printf("%d\n%d\n",sizeof(_2d[0]),sizeof(_2d));
	printf("%u %u %u\n",_2d,_2d+1	,&_2d+1);
	return 0;
}