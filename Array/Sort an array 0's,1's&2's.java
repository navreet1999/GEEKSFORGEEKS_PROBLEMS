//   https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
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
		    Arrays.sort(a);
		    for(int i=0;i<n;i++)
		     System.out.print(a[i]+" "); 
		    t--;
		    System.out.println();
		}
	}

}