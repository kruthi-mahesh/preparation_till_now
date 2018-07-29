#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
	int n;
	cin>>n;
	string * arr = new string[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
		cout<<arr[i]<<" ";
	}
	cout<<endl;
	sort(arr,arr+n);
	for(int i=0;i<n;i++)
		cout<<arr[i]<<" ";
	cout<<endl;

	return 0;
}