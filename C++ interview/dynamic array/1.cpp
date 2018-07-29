#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
	int *p = new int[3];
	p[0] = 23;
	p[1] = 45;
	cout<<*p++;
	cout<<*p;
	return 0;
}