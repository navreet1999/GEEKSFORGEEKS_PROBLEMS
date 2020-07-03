https://practice.geeksforgeeks.org/problems/count-the-triplets/0

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
		    triplet(a,n);
		    t--;
		}
	}
	public static void triplet(int a[],int size)
	{
	   Map< Integer,Integer> map =  
                        new HashMap< Integer,Integer>(); 
                        
        for(int m = 0;m < size ; m++){
            map.put(a[m],m);
          }
	    int count = 0;
	    for(int i = 0; i < size-1; i++){
	        for(int j = i+1; j < size; j++){
	            if(map.containsKey(a[i]+a[j]))
	               count++;
	           
	        }
	    }
	   if(count == 0) 
	       System.out.println("-1");
	   else 
        System.out.println(count);
	}
}
