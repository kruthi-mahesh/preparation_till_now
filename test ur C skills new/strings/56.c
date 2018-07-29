#include <stdio.h>

int main(int argc, char const *argv[])
{
	static char s[25] = "Thecocaine man";
	int i=0;
	char ch;
	ch = s[++i];
	printf("%c  %c  %d\n",ch,s[i],i );
	ch = s[i++];
	printf("%c  %c  %d\n",ch,s[i],i );
	ch = i++[s];
	printf("%c  %c  %d\n",ch,s[i],i );
	ch=++i[s];
	printf("%c  %c  %d\n",ch,s[i],i );
	return 0;
}