
https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
		    String s=sc.next();
		    reverse(s);
		}
	}
	
	public static void reverse(String str)
	{
	    String s[]=str.split("\\.");
	    String ans="";
	    for(int i=s.length-1;i>=1;i--)
	    {
	        ans+=s[i]+".";
	        //ans+=".";
	    }
	    ans+=s[0];
	    
	   System.out.println(ans);
	}
}