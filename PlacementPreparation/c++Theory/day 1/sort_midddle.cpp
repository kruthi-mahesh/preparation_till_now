#include <iostream>
#include <algorithm>
 using namespace std;
int main()
{
	string str;
	cin>>str;
	sort(str.begin()+1,str.end());
	cout<<str;
	return 0;
}