//https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately/0/

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
		    //int sum=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int i=0,j=n-1;
		     String str="";
		     while(j>i)
		    {
		        
		       
		       
		        str=arr[j]+" "+arr[i]+" ";
		        i++;
		        j--;
		        System.out.print(str);
		     }
		     if(i==j)
		     {
		         str=arr[i]+"";
		         System.out.print(str);
		         
		     }
		     System.out.println();
		     
		}
	}
}