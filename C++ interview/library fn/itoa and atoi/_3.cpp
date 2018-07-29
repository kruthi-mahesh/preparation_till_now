
#include <iostream>
using namespace std;
string itoa(int value, unsigned int base) {
	
	const char digitMap[] = "0123456789abcdef";
	
	string buf;
	
	if (base == 0 || base > 16) {
	
		// Error: may add more trace/log output here
	
		return buf;
	
	}
	

	
	// Take care of negative int:

	
	string sign;
	
	int _value = value;
	

	
	// Check for case when input is zero:
	
	if (_value == 0) return "0";
	

	
	if (value < 0) {
	
		_value = -value;
	
		sign = "-";
	
	}
	


	
	// Translating number to string with base:
	
	for (int i = 30; _value && i ; --i) {
	
		buf = digitMap[ _value % base ] + bufs ;
	
		_value /= base;
	
	}
	
	return sign.append(buf);
	
}

int main(int argc, char const *argv[])
{
	int a = -876543221;
	string str = itoa(a,10);
	cout<<str<<endl;
	return 0;
}