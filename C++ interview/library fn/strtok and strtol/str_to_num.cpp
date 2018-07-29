
#include <iostream>
#include <sstream>

using namespace std;

int main(int argc, char const *argv[])
{
	string Text = "456"; // string containing the number

int Result;          //number which will contain the result

istringstream convert(Text); // stringstream used for the conversion constructed with the contents of 'Text' 
                             // ie: the stream will start containing the characters of 'Text'

if ( !(convert >> Result) ) //give the value to 'Result' using the characters in the stream
    Result = 0;             //if that fails set 'Result' to 0

//'Result' now equal to 456  
cout<<Result<<endl;
	return 0;
}