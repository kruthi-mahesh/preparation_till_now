
#include <iostream>
using namespace std;
void itoa(int value, string& buf, int base){
	
	int i = 30;
	
	buf = "";
	
	for(; value && i ; --i, value /= base) buf = "0123456789abcdef"[value % base] + buf;
	
}
int main(int argc, char const *argv[])
{
	int a = 0b00111111111111111111111110;
	string str;
	itoa(a,str,2);
	a= 987654431;
	itoa(a,str,10);
	cout<<str<<endl;
	return 0;
}