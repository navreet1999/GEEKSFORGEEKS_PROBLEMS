https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string/0


#include <iostream>
#include<algorithm>
//#include<bits/stdc++.h>
using namespace std;
vector<string> v;
string swap(string s,int i,int j)
{
    string str=s;
    char temp=str[i];
    str[i]=str[j];
    str[j]=temp;
    return str;
}
void permut(string str,int l,int r)
{
    int i;
    if(l==r)
    {
        v.push_back(str);
    }
    for(int i=l;i<=r;i++)
    {
        str=swap(str,l,i);
        permut(str,l+1,r);
        str=swap(str,l,i);
    }
}
int main()
 {
     int t;
     cin>>t;
     while(t--)
     {
         v.resize(0);
         string s;
         cin>>s;
         sort(s.begin(),s.end());
         int n=s.size()-1;
         permut(s,0,n);
         sort(v.begin(),v.end());
         for(int i=0;i<v.size();i++)
         cout<<v[i]<<" ";
         cout<<"\n";
     }
	//code
	return 0;
}