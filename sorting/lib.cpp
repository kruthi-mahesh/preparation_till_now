#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
	int n;
	cin>>n;
	int * arr = new int[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
		cout<<arr[i]<<" ";
	}
	cout<<endl;
	sort(arr,arr+n-1 	 );
	for(int i=0;i<n;i++)
		cout<<arr[i]<<" ";
	cout<<endl;

	return 0;
}