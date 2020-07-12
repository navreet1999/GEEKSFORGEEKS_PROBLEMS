// https://practice.geeksforgeeks.org/problems/next-larger-element/0

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n = Integer.parseInt(br.readLine());
		    long a[] = new long[n];
		    
		    String s[] = br.readLine().split(" ");
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i] = Long.parseLong(s[i]);
		    }
		   
		   findNGE(a,n);
		}
	}
	
	public static void findNGE(long arr[],int n)
	{
	    Stack<Long> st=new Stack<Long>();
	    long ans[]=new long[n];
	 //   st.push(arr[0]);
	    
	    //iterate kardo i+1 se
	    for(int i=n-1;i>=0;i--)
	    {
	        
	        //jab tak stack empty na ho aur peek<arr[i] to pop kardo
	        while(st.empty()==false && st.peek()<=arr[i])
	           st.pop();
	            
	        ans[i] = st.empty() ? -1 : st.peek();
            
	        st.push(arr[i]);
	        
	     
	        
	    }
	    
	    for(int i=0;i<ans.length;i++)
	      System.out.print(ans[i]+" ");
	    
	    System.out.println();
	}
	
	
}