using namespace std;

void reverse(int arr[], int n, int k) 
{ 
    for (int i = 0; i < n; i += k) 
    { 
        int left = i; 
  
        // to handle case when k is not multiple of n 
        int right = min(i + k - 1, n - 1); 
  
        // reverse the sub-array [left, right] 
        while (left < right) 
            swap(arr[left++], arr[right--]); 
            
    
  
    } 
       for (int i = 0; i < n; i++) 
        cout << arr[i] << " "; 
        cout<<endl;
} 

int main()
{
    int t;
    cin>>t;

    while(t--){
        int n,k;
        cin>>n>>k;
        int a[n];
        for(int i=0;i<n;i++)
        cin>>a[i];
        
        reverse(a,n,k);
       
    }
}
