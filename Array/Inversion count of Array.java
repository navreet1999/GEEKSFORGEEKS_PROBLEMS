//https://practice.geeksforgeeks.org/problems/inversion-of-array/0/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		     System.out.println(mergeSortAndCount(a, 0, n- 1)); 
		    t--;
		}
	}
private static int mergeAndCount(int[] arr, int l, int m, int r) 
    { 
  
        // Left subarray 
        int[] left = Arrays.copyOfRange(arr, l, m + 1); 
  
        // Right subarray 
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1); 
  
        int i = 0, j = 0, k = l, swaps = 0; 
  
        while (i < left.length && j < right.length) { 
            if (left[i] <= right[j]) 
                arr[k++] = left[i++]; 
            else { 
                arr[k++] = right[j++]; 
                swaps += (m + 1) - (l + i);     //6 7 10 jese 6 k bad vale element bhi bde hai
            } 
        } 
  
        // Fill from the rest of the left subarray 
        while (i < left.length) 
            arr[k++] = left[i++]; 
  
        // Fill from the rest of the right subarray 
        while (j < right.length) 
            arr[k++] = right[j++]; 
  
        return swaps; 
    } 
  
    // Merge sort function 
    private static long mergeSortAndCount(int[] arr, int l, int r) 
    { 
  
        // Keeps track of the inversion count at a 
        // particular node of the recursion tree 
        long count = 0; 
  
        if (l < r) { 
            int m = (l + r) / 2; 
  
            // Total inversion count = left subarray count 
            // + right subarray count + merge count 
  
            // Left subarray count 
            count += mergeSortAndCount(arr, l, m); 
  
            // Right subarray count 
            count += mergeSortAndCount(arr, m + 1, r); 
  
            // Merge count 
            count += mergeAndCount(arr, l, m, r); 
        } 
  
        return count; 
    } 
  
}
