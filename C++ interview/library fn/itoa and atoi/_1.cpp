#include <iostream>
using namespace std;
char* itoa(int val, int base){
	
	static char buf[32] = {0};
	cout<<buf<<endl;
	
	int i = 30;
	
	for(; val && i ; --i, val /= base)
	
		buf[i] = "0123456789abcdef"[val % base];
	
	return &buf[i+1];
	
}
int main(int argc, char const *argv[])
{
	int a = 0b111111111111111111111111;
	char * str = itoa(a,2);
	cout<<str<<endl;
	return 0;
}