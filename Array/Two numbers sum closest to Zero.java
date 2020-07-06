/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int l=0;
		int r=n-1;
		int min_l=l;
		int min_r=r;
		int min_sum=Integer.MAX_VALUE;
		while(l<r)
		{
			int sum=a[l]+a[r];
			if(Math.abs(sum) < Math.abs(min_sum))
		    {
		      min_sum = sum;
		      
		    }
		 
			if(sum>0)
			{
				r--;
			}
			else
			{
				l++;	
			}
			
		}
		System.out.println(min_sum);
	}
//	System.out.println();
	}
}