//     https://practice.geeksforgeeks.org/problems/form-a-palindrome/0

import java.lang.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    String s=sc.next();
		     int n=s.length();
		    System.out.println(LCS(s,n));
		}
	}
	
     static int lcs( String X, String Y, int m, int n ) 
    { 
        int L[][] = new int[n+1][n+1]; 
        int i, j; 
  
        
        for (i=0; i<=m; i++) 
        { 
            for (j=0; j<=n; j++) 
            { 
                if (i == 0 || j == 0) 
                    L[i][j] = 0; 
  
                else if (X.charAt(i-1) == Y.charAt(j-1)) 
                    L[i][j] = L[i-1][j-1] + 1; 
  
                else
                    L[i][j] = Integer.max(L[i-1][j], L[i][j-1]); 
            } 
        } 
  
        /* L[m][n] contains length of LCS for 
           X[0..n-1] and Y[0..m-1] */
        return L[m][n]; 
    } 
  
    
    static int LCS(String str, int n) 
    { 
       
        StringBuffer sb = new StringBuffer(str); 
        sb.reverse(); 
        String revString = sb.toString(); 
  
        
        return (n - lcs(str, revString , n, n)); 
    } 
  
}