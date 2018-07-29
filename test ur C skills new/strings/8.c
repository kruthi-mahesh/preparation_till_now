 #include <stdio.h>
int main(int argc, char const *argv[])
{
	char p=  "%d\n";
	char p2[] = {'%','d','\n','%d','\0'};
	p2[1] = 'c';
	printf("%s\n%lu \n%c\n",p2,sizeof("%d") ,p2[3]);;
	return 0;
}