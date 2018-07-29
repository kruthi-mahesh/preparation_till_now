#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;
string itoa(int value, int base) {
	


	
	enum { kMaxDigits = 35 };
	
	string buf;
	
	buf.reserve( kMaxDigits ); // Pre-allocate enough space.
	

	
	// check that the base if valid
	
	if (base < 2 || base > 16) return buf;
	


	
	int quotient = value;
	

	
	// Translating number to string with base:
	
	do {
	
		buf += "0123456789abcdef"[ int(abs( quotient % base )) ];
	
		quotient /= base;
	
	} while ( quotient );
	


	
	// Append the negative sign for base 10
	
	if ( value < 0 && base == 10) buf += '-';
	

	
	reverse( buf.begin(), buf.end() );
	
	return buf;
	
}

int main(int argc, char const *argv[])
{
	int a = -987654332;
	string str = itoa(a,10);
	cout<<str<<endl;
	return 0;
}