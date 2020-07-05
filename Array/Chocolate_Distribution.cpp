// https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem/0

#include<bits/stdc++.h> 


using namespace std;

int choc_distribute(int a[],int pac,int child)
{
    int min=INT_MAX;
    int dif=0;
    if(pac==0 || child==0)
    return 0;
    
    if(child>pac)
    return -1;
    
    sort(a,a+pac);
    
    for(int i=0;i+child-1<pac;i++)
    {
        dif=a[i+child-1]-a[i];
        if(dif<min )
           min=dif;
    }
    return min;
}

int main() {


  int t;
  cin>>t;
  while(t--)
  {
      int pac;
      cin>>pac;
      int a[pac];
      for(int i=0;i<pac;i++)
      {
          cin>>a[i];
      }
      int child;
      cin>>child;
     cout<<(choc_distribute(a,pac,child))<<endl;
  }
}
