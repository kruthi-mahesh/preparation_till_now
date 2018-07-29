#include <stdio.h>
#include <string.h>
struct emp
{
	char name[25];
	int age;
};
void modify(struct emp*);

int main(int argc, char const *argv[])
{
	struct emp e = {"Sanjay",3};
	modify(&e);
	return 0;
}

void modify(struct emp *p)
{
	strlen(p->name);

}