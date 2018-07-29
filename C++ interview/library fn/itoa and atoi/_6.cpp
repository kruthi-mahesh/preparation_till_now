#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;
std::string itoa(int value, int base) {

		std::string buf;

		// check that the base if valid
		if (base < 2 || base > 16) return buf;

		enum { kMaxDigits = 35 };
		buf.reserve( kMaxDigits ); // Pre-allocate enough space.

		int quotient = value;

		// Translating number to string with base:

		do {
			buf += "0123456789abcdef"[ std::abs( quotient % base ) ];
			quotient /= base;
		} while ( quotient );

		// Append the negative sign
		if ( value < 0) buf += '-';

		std::reverse( buf.begin(), buf.end() );
		return buf;
	}

	int main(int argc, char const *argv[])
{
	int a = -987654332;
	string str = itoa(a,10);
	cout<<str<<endl;
	return 0;
}