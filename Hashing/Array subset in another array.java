//https://practice.geeksforgeeks.org/problems/array-subset-of-another-array/0


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
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
		     
		     
		     if( subset(a,b,n1,n2)==true)
		       System.out.println("Yes");
		     else
		        System.out.println("No");
		    
		}
		
	}
	
	public static boolean subset(int a[],int b[],int n1,int n2)
	{
	    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	    
	    for(int i=0;i<n1;i++)
	    {
	        if(map.containsKey(a[i]))
	          map.put(a[i],map.get(a[i])+1);
	        else
	          map.put(a[i],1);
	        
	    }
	    for(int i=0;i<n2;i++)
	    {
	        if(!map.containsKey(b[i]))
	          return false;
	    }
	    return true;
	}
}
