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
		    int n1=sc.nextInt();
		    int n2=sc.nextInt();
		    int a[]=new int[n1];
		    int b[]=new int[n2];
		    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		    
		    for(int i=0;i<n1;i++)
		    {
		        a[i]=sc.nextInt();
		        if(map.containsKey(a[i]))
		            map.put(a[i],map.get(a[i])+1);
		        else
		           map.put(a[i],1);
		    }
		    
		    int res=0,count=0;
		    int out[]=new int[n1];
		    for(int i=0;i<n2;i++)
		    {
		        b[i]=sc.nextInt();
		        if(map.containsKey(b[i]))
		        {
		            count=map.get(b[i]);
		            for(int k=0;k<count;k++)
		              out[res+k]=b[i];
		              
		              res+=count;
		              map.remove(b[i]);
		        }
		    }
		    
		    ArrayList<Integer> list=new ArrayList<Integer>(map.keySet());
		    Collections.sort(list);
		    
		    for(int i:list)
		    {
		        int k=map.get(i);
		        for(int j=0;j<k;j++)
		          out[res++]=i;
		    }
		    for(int i=0;i<n1;i++)
		   System.out.print(out[i]+" ");
		   System.out.println();
		   
		   
		}
	}
}