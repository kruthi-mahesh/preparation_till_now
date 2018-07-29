#include <iostream>
using namespace std;
#define steps 10
int count(int n)
{
	int dp[n+1];
	int fibo[n+1];
	fibo[0] = 1;
	fibo[1] = 1;
	fibo[2] = 2;
	dp[0] = 1;
	dp[1] = 1;
	dp[2] = 2;

	

	for (int i = 3; i < n+1; ++i)
	{
		fibo[i] =  fibo[i-1] + fibo[i-2];
		dp[i] = dp[i-1] + dp[i-2] + fibo[i-3];
	}

	for(int i=0;i<n+1;i++)
	{
		cout<<i<<": "<<dp[i]<<", "<<fibo[i]<<endl;
	}
	return dp[n];
}
int main(int argc, char const *argv[])
{
	int n ;
	cin>>n;
	cout<<count(n)<<endl;
	return 0;
}