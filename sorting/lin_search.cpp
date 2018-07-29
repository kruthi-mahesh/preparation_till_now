#include <iostream>
using namespace std;
int lin(int arr[],int n,int key){
	int i;
	for(i=0;i<n;i++)
		if(arr[i] == key)
			return i;
	return -1;
}
int bin(int arr[],int l,int r,int key)
{
	while(l<=r){
		int mid = l + (r-l)/2;
		if(arr[mid] == key)
			return mid;
		if(arr[mid] > key)
			r = mid-1;
		else
			l = l+1;
	}
	return -1;
}
int main(int argc, char const *argv[])
{
	int n;
	cin>>n;
	int arr[n];
	for(int  i=0;i<n;i++)
		cin>>arr[i];
	cout<<lin(arr,n,3)<<endl;
	cout<<bin(arr,0,n-1,3)<<endl;
	return 0;
}