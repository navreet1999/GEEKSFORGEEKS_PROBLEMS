https://practice.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/1https://practice.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/1

// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) 
                a[i] = sc.nextInt();
            

            GfG g = new GfG();
            int n = g.maxLen(a, a.length);

            System.out.println(n);

            T--;
        }
    }
}
// } Driver Code Ends


class GfG {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int N)
    {
        int largest=0;
        int sum=0;
        int value=0;
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        
        for(int i=0;i<N;i++)
        {
            if(arr[i]==0)
            sum--;
            else
            sum++;
            
            if(sum==0)
            {
               value=i+1;
               if(largest<value)
               largest=value;
               
            }
            else if(map.containsKey(sum))
            {
                value=i-map.get(sum);
                
                if(largest<value)
                 largest=value;
            }
            else
            map.put(sum,i);
        }
                       
        return largest;
    }
}
