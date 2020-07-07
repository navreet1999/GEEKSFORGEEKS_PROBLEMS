
import java.util.*;
import java.lang.*;
import java.io.*;


class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-- >0)
	 {
		String a=sc.next();
		String b=sc.next();
		String A=a.toLowerCase();
        String B=b.toLowerCase();
        char[] s1AsChar = A.toCharArray();
        char[] s2AsChar = B.toCharArray();
     if (A.length() == B.length())
     {
        Arrays.sort(s1AsChar);
        Arrays.sort(s2AsChar);
     }
		     if(Arrays.equals(s1AsChar, s2AsChar))
		    		 {
		    	 		System.out.println("YES");
		    		 }
		     else
		     {
		    	 System.out.println("NO");
		     }
	 }
	 }
}