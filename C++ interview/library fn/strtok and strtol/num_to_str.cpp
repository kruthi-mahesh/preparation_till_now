#include <iostream>
#include <sstream>

using namespace std;
int main(int argc, char const *argv[])
{
	int Number = 123;
	string String = static_cast<ostringstream*>( &(ostringstream() << Number) )->str();
	cout<<String<<endl;
	return 0;
}