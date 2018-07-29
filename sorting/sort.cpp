#include <iostream>
using namespace std;

void selectionSort(int arr[],int n){
	int i,j,minIndx;
	for(i = 0;i<n-1;i++)
	{
		minIndx = i;
		for(j=i+1;j<n;j++)
			if(arr[minIndx]>arr[j])
				swap(arr[minIndx],arr[j]);

	}
}
int main(int argc, char const *argv[])
{
	int n;
	cin>>n;
	int arr[n];
	for(int  i=0;i<n;i++)
		cin>>arr[i];
	cout<<selectionSort(arr,n)<<endl;
	return 0;
}