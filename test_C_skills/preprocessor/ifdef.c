int main(int argc, char const *argv[])
{
	#define NOTE
	#ifdef NOTE
	/* unterminated comment*/
	//while(1);
	int a;
	a=20;
	#endif
	//int a=10;
	printf("%d",a);

	int j=34;
	#undef NOTE
	printf("  %d\n",j );

	return 0;
}