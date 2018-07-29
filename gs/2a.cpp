#include <iostream>
using namespace std;

int find(int n)
{
	int arr[n+1];
	arr[0] = 1;
	arr[1] =  0;
	for(int i=2;i<=n;i++)
		arr[i] = arr[i-1]  + 2*arr[i-2] + 2;
	return arr[n];
}

int main(int argc, char const *argv[])
{
	cout << find(14);
	return 0;
}