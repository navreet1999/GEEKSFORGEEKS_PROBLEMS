//      https://practice.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1


// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
 {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] a = new int[n];
	       for(int i=0;i<n;i++) {
	           a[i] = in.nextInt();
	       }
	       System.out.println(new countsubArray().countSubarrWithEqualZeroAndOne(a, n));
	   }
	 }
}

// } Driver Code Ends


//User function Template for Java

class countsubArray
{
    // arr[] : the input array
    // N : size of the input array
    
    // return the number of subarrays with equal 0s and 1s
    static int countSubarrWithEqualZeroAndOne(int arr[], int N)
    {
        // add your code here
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int sum=0;
        int count=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i]==1)
             sum++;
             else
             sum--;
             
             if(sum==0)
             {
                count++;
                
             }
             if(map.containsKey(sum))
             {
                
                 count+=map.get(sum);
             }
              if (!map.containsKey(sum)) 
                map.put(sum, 1); 
             else
              map.put(sum,map.get(sum)+1);
             
        }
        return count;
    }
}


