
class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int max=0;
        int sum=0,index=0,value=0;
        
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
           
            if(sum==0){
                max=i+1;
            }
            if(map.containsKey(sum))
            {
                index=map.get(sum);
                value=i-index;
                if(value>max)
                max=value;
            }
            else
            map.put(sum,i);
        }
        return max;
    }
}