import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		   String sizes[] = br.readLine().split(" ");
		   int n = Integer.parseInt(sizes[0]);
		   int k = Integer.parseInt(sizes[1]);
		   
		   String s[] = br.readLine().split(" ");
		   int a[] = new int[n];
		   for(int i =0;i<n;i++)
		    a[i] = Integer.parseInt(s[i]);
		    
		    maxOfWindow(a,n,k);

		 }
		        
	}
	
	static void maxOfWindow(int a[],int n,int k)
	{   int i;
	    Deque<Integer> q = new LinkedList<>();
	    StringBuffer sb = new StringBuffer();
	    for(i=0;i<k;i++)
	    {
	        while(!q.isEmpty() && a[i]>a[q.peekLast()])
	            q.removeLast();
	       q.addLast(i);
	        
	    }
	    
	    sb.append(a[q.peek()]+" ");
	    
	    for(;i<n;i++)
	    {
	        while(!q.isEmpty() && q.peek() <= i-k )
	            q.removeFirst();
	            
	        while(!q.isEmpty() && a[i]>a[q.peekLast()])
	            q.removeLast();
	       q.addLast(i);
	       
	       sb.append(a[q.peek()]+" ");
	    }
	    
	    System.out.println(sb);
	}
    
}
