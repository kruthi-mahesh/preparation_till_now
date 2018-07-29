#include <iostream>
#define steps 10
using namespace std;
int count(int n)
{
	int dp[n+1];
	dp[0] = 1;
	dp[1] = 1;
	dp[2] = 2;
	for(int i=3;i<n+1;i++)
		dp[i] = dp[i-1]  +dp[i-2] + dp[i-3];
	for(int i=0;i<n+1;i++)
		cout<<i<<": "<<dp[i]<<endl;
	
	return dp[n];
}
int main(int argc, char const *argv[])
{
	int n;
	cin>>n;
	//n = steps;	
	cout<<count(n) <<endl;
	return 0;
}