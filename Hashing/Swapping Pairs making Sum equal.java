//https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    int n1=sc.nextInt();
		    int n2=sc.nextInt();
		    
		    int a[]=new int[n1];
		    int b[]=new int[n2];
		    
		    for(int i=0;i<n1;i++)
		     a[i]=sc.nextInt();
		    
		    for(int i=0;i<n2;i++)
		     b[i]=sc.nextInt();
		     
		     
		     System.out.println( swap(a,b,n1,n2));
		    
		}
	}
	
	public static int swap(int a[],int b[],int n1,int n2)
	{
	    int sum1=0;
	    int sum2=0;
	    
	    Arrays.sort(a);
	    Arrays.sort(b);
	    
	   for(int i=0;i<n1;i++)
	     sum1+=a[i];
	    
	   for(int i=0;i<n2;i++)
	     sum2+=b[i];
	     
	   int diff=Math.abs(sum2-sum1);
	   
	   int i=0,j=0;
	   
	   while(i<n1 && j<n2)
	   {
	       if(a[i]+b[j]==diff)
	         return 1;
	       else if(a[i]>b[j])
	         i++;
	        else
	         j++;
	   }
	   return -1;
	}
}
