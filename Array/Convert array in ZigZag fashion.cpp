using namespace std;

void zigZag(int arr[], int n) 
{ 
    
    bool flag = true; 
  
    for (int i=0; i<=n-2; i++) 
    { 
        if (flag) 
        {
            if (arr[i] > arr[i+1]) 
                swap(arr[i], arr[i+1]); 
        } 
        else 
        {
            if (arr[i] < arr[i+1]) 
                swap(arr[i], arr[i+1]); 
        } 
        flag = !flag; /* flip flag */
    } 
    for(int i=0;i<n;i++)
          cout<<arr[i]<<" "; cout<<"\n";
} 

int main() {
	
int t;
cin>>t;
 while(t--){
     int n;cin>>n;int a[n];int flag=0;
     for(int i=0;i<n;i++)
       cin>>a[i];
       zigZag(a,n);
     
      
 }
}
