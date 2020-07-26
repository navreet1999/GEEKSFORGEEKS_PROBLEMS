//https://practice.geeksforgeeks.org/problems/zero-sum-subarrays/0


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
        
        for(int u =0;u<T;u++ )
		{
             int N  = sc.nextInt();
             
		    
		    HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		    int[] arr = new int[N];
		    
		    int pre_sum=0, count=0;
		    
		    for(int i =0;i<N;i++)
		    {   
		        arr[i] = sc.nextInt();
		        pre_sum+=arr[i];
		        if(pre_sum==0)
		        {
		           count++;
		        }
		        if(h.containsKey(pre_sum))
		          {  count+=h.get(pre_sum);
		             h.put(pre_sum,h.get(pre_sum)+1);
		          }
		        else{
		            h.put(pre_sum,1);
		        }
		        
		           
		    }
		    System.out.println(count);
		}
	}
}
