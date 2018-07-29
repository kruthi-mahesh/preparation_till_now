#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
	int a =5;
	int &b =a;
	b= 4;
	int c=  8;
	b=20;
	b = c;
	//b = 80;
	c=90;

	const int &b1 = 78;
	c = b1;
	b1 = 7;
	cout<<a<<" "<<b<<" " << c<<" " << b1;
	return 0;
}