import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0 )
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    logic(a,n);
		}
	}
	public static void logic(int arr[],int n)
	{
	    Map<Integer, Boolean> numberMap 
            = new HashMap<>(); 
  
        int max = arr.length; 
  
        for (Integer i : arr) { 
  
            if (numberMap.get(i) == null) { 
                numberMap.put(i, true); 
            } 
            else { 
                System.out.print(i+" "); 
            } 
        } 
        for (int i = 1; i <= max; i++) { 
            if (numberMap.get(i) == null) { 
                System.out.print(i+" "); 
            } 
        } 
        System.out.println();
	}
}
