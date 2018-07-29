#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
	int D = 2,i,j,k,ct=0,tot=0,sum=0;
	int n=5;
	for(i=1;i<=n;i++){
		sum=0;
		for(j=i;j<=n;j++){
			ct=0;
			for(k=j+1;k<=n;k++){
				ct+=1;
				tot+=1;
			}
			cout<<ct<<" + ";
			sum+=ct;
		}
		cout<<" = " << sum<<endl;
	}
	cout<<tot<<endl;
	return 0;
}