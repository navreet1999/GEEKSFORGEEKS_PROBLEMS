public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       ArrayList<Integer> ans=new ArrayList<Integer>();
        Arrays.sort(arr2); 
  
        for (int i = 0; i < m; i++) { 
            
            int index = binary_search(arr2, 0, n - 1, arr1[i]); 
            ans.add(index + 1); 
        } 
        return ans;
    }
    public static int binary_search(int arr[], int l, int h, int x) 
    { 
        while (l <= h) { 
            int mid = (l + h) / 2; 
  
            if (arr[mid] <= x) 
                l = mid + 1; 
             else
                h = mid - 1; 
        } 
        return h; 
    } 
