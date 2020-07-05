//    https://practice.geeksforgeeks.org/problems/equilibrium-point/0


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	public static void main (String[] args) {
	FastReader sc=new FastReader(); 
		int t=sc.nextInt();
		
		while(t>0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		     System.out.println(eq(a,n)); 
		    t--;
		}
	}
	public static int eq(int a[],int n)
	{
	    int sum=0;
	    int lsum=0;
	    
	    if(n==1)
	    return 1;
	    
	    for(int i=0;i<n;i++)
	    sum+=a[i];
	    
	    for(int i=0;i<n;i++)
	    {
	        sum-=a[i];
	        if(lsum==sum)
	        return i+1;
	        
	        lsum+=a[i];
	    }
	    return -1;
	}
}
