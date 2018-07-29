int main(int argc, char const *argv[])
{
	int a[][4] = {1,2,3,4,5,6,7,8,9,10,11,12};
	int i,j;
	//int *p[] = {(int*)a,(int*)a+1,(int*)a+2,(int*)a+11};
	//printf("*p[3] %d\n",*p[3]);
	int *p[] = {a,a+1,a+2,a+11};
	printf("*p[1] %d\n",*p[1]);
	printf("a %u\n p  %u\n*p %u\np+1 %u\n*p+1 %u\n",a,p,*p,p+1,*p+1);
	printf("Array p: \n%u %u %u %u\n",p[0],p[1],p[2],p[3]);	


	for(i=0; i<=2; i++)
	{
		for(j=0; j<=3; j++){
			printf("index %d %d %d %d\n",p[i][j],j[p][i],i[p][j],p[j][i]);
			printf("%d %d %d %d\n",
				*(*(p+i)+j),
				*(*(j+p)+i),
				*(*(i+p)+j),
				*(*(p+j)+i));
			printf("%u %u %u %u\n",
				*(p+i)+j,
				*(j+p)+i,
				*(i+p)+j,
				*(p+j)+i);
			printf("%u %u %u %u\n",
				*(p+i),
				*(j+p),
				*(i+p),
				*(p+j));
			printf("%u %u %u %u\n",
				p+i,
				j+p,
				i+p,
				p+j);

		}
	}
	return 0;
}
