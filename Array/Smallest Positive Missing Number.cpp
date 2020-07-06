#include <iostream>
using namespace std;


int num(int n,int a[])
{
    bool b[n+1]={false};
    for(int i=0;i<n;i++)
    {
        if(a[i]>0 && a[i]<=n)
          b[a[i]]=true;
    }
    for(int i=1;i<=n;i++)
    {
        if(b[i]==false)
        return i;
    }
    return -1;
}
int main() {
	//code
	int t;
	cin>>t;
	while(t--)
	{
	    int  n;
	    cin>>n;
	    int a[n];
	    for(int i=0;i<n;i++)
	    cin>>a[i];
	    
	    cout<<num(n,a)<<endl;
	    
	}
	return 0;
}