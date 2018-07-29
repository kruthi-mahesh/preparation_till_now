int main(int argc, char const *argv[])
{
	 int a[20];
	int i=1;
	a[i]=i++;
	printf("%d\n%d\n%d\n%d\n",a[0],a[1],a[2],i);
	return 0;
}