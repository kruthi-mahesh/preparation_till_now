#include<bits/stdc++.h>
using namespace std;

int main()
{
int t;
cin>>t;
while(t--)
{
    long long int n,i,x=0;
    cin>>n;
    int a[n];
    for(i=0;i<n;i++)
    {
        cin>>a[i];
        x=x^a[i];
    }
        cout<<x<<endl;
}
return 0;
}
