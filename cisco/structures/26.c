#include <stdio.h>
struct stud
{
	char *c;
	struct stud * point;
	
};

int main(int argc, char const *argv[])
{
	struct stud s,m;
	s.c = m.c = "hi";
	m.point =  &s;
	(m.point)->c = "hey";
	printf("%s\t%s\n",s.c,m.c );
	return 0;
}