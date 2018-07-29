#include <iostream>
#include <algorithm>
using namespace std;
int main(int argc, char const *argv[])
{
	int ar[5] = {51,4,3,21,1};
	sort(ar,ar+3);
	for(int i=0;i<5;i++)
		cout<<" "<<ar[i]<<endl;
	return 0;
}