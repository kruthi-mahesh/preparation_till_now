#include <iostream>
#include <sstream>

using namespace std;

int main(int argc, char const *argv[])
{
	int Number = 123;       // number to be converted to a string

string Result;          // string which will contain the result

ostringstream convert;   // stream used for the conversion

convert << Number;      // insert the textual representation of 'Number' in the characters in the stream

Result = convert.str(); // set 'Result' to the contents of the stream

          // 'Result' now is equal to "123" 

cout<<Result;
	return 0;
}