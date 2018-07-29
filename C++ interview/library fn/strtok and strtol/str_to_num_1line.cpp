
#include <iostream>
#include <sstream>

using namespace std;
int main(int argc, char const *argv[])
{
	string Text = "456";
int Number;
if ( ! (istringstream(Text) >> Number) ) Number = 0;
cout<<Number<<endl;
	return 0;
}