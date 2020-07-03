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
		    int sum=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    subarray(a,n,sum);
		    t--;
		}
	}
	
	public static void subarray(int a[],int n,int sum)
	{
	    int left=0;
	    int right=0;
	    int curr_sum=0;
	    int flag=0;
	    
	    for(int i=0;i<n;i++)
	    {
	         curr_sum+=a[i];
	        while(curr_sum>sum)
	        {
	            curr_sum-=a[left];
	            left++;
	        }
	        if(curr_sum<sum )
	        {
    
	           right++;
	        }
	        
	        else  if(curr_sum==sum)
	        {
	            System.out.println((left+1)+" "+(right+1));
	            flag=1;
	            break;
	        }
	    }
	    if(flag==0)
	    System.out.println(-1);
	   
	    
	}
}
