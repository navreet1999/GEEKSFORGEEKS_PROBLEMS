import java.util.*;
import java.lang.*;
import java.io.*;
class Main
 {
	public static void main (String[] args) throws IOException
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while(t-->0)
	    {
	        String sizes[] = br.readLine().trim().split("\\s+");
	        int x = Integer.parseInt(sizes[0]);
	        int y = Integer.parseInt(sizes[1]);
	        
	        String input[]=br.readLine().trim().split("\\s+");
	        int a[] = new int[x];
	        for(int i=0;i<x;i++)
	          a[i] = Integer.parseInt(input[i]);
	   
  	        String input2[]=br.readLine().trim().split("\\s+");
	        int b[] = new int[y];
	        for(int i=0;i<y;i++)
	          b[i] = Integer.parseInt(input2[i]);
	          
	          mergeTwoArrays(a,x,b,y);
	    }
	 }
	 
// 	Instead of insertion sort , I have a simple approach-first sort both the array a1- 1 5 9 10 15 20
// a2- 2 3 8 13 then take two pointer i start from last index of a1 & j start from first index of 
//a2 then swap num if  a2[j]<a1[i]then sort both array again
// Eg swap 2 & 20 ,3 & 15 so on...
	 
	 static void mergeTwoArrays(int a1[],int x,int a2[],int y)
	 {
	     int pt1 = a1.length-1; //Last index of a
	     int pt2 = 0; //First Index of b
	     
	     while(pt1 >=0 && pt2 < a2.length)
	     {
	         if(a1[pt1]>a2[pt2]) //smaller elements should be in array1. (Greatest element of a1 should be lesser than smallest element of a2)
	         {
	            int temp = a1[pt1];
	            a1[pt1] = a2[pt2];
	            a2[pt2] = temp;
	         }
	         
	         pt1--;
	         pt2++;
	     }
	     
	     //Now sort both arrays.
	     Arrays.sort(a1);
	     Arrays.sort(a2);
	     
	     //This is just for printing.Main thing is done above.
	     StringBuilder sb = new StringBuilder();
	     for(int i=0;i<a1.length;i++)
	     {
	         sb.append(a1[i]+" ");
	     }
	     
	     for(int i=0;i<a2.length;i++)
	     {
	         sb.append(a2[i]+" ");
	     }
	     
	     System.out.println(sb);
	 }
}
