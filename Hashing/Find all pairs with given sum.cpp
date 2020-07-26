using namespace std;
int main()
 {
	int t;
	cin>>t;
	while(t--) {
	    int n,m,x,i;
	    cin>>n>>m>>x;
	    vector<int> a(n);
	    vector<int> b(m);
	    unordered_map<int,int>map1;
	    for(i=0; i<n; i++)
	       cin>>a[i];
	    for(i=0; i<m; i++) {
	       cin>>b[i];
	       map1[b[i]] = 1;
	    }
	    int c = 0;
	    sort(a.begin(), a.end());
	    for(i=0; i<n; i++) {
	        if(map1.find(x-a[i]) != map1.end()) {
	            if(c != 0)
	                cout<<", ";
	            cout<<a[i]<<" "<<x-a[i];
	            c++;
	        }
	    }
	    if(c == 0)
	        cout<<"-1"<<endl;
	    else
	        cout<<endl;
	}
	return 0;
}
