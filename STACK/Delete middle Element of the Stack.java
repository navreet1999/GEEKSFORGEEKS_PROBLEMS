//https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1

// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    
	    int testcases=sc.nextInt();
	    
	    while(testcases-->0)
	    {
	        int sizeOfStack =sc.nextInt();
	        
	        Stack <Integer> myStack=new Stack<>();
	        
	        for(int i=0;i<sizeOfStack;i++)
	        {
	            int x=sc.nextInt();
	            myStack.push(x);
	            
	        }
	        
	        if(sizeOfStack==1)
	        {
	            System.out.println(myStack.peek());
	        }
	        else
	        {
	            Geeks obj=new Geeks();
	            Stack <Integer> modified=obj.deleteMid(myStack,sizeOfStack,0);
	            
	            while(!modified.isEmpty())
	            {
	                System.out.print(modified.peek()+" ");
	                modified.pop();
	            }
	            System.out.println();
	        }
	    }
	    
	    
	}
}
// } Driver Code Ends


//User function Template for Java

class Geeks
{
    //Complete this function
    public Stack<Integer> deleteMid(Stack<Integer>s,int size,int current)
    {
        //Your code here
        if(s.isEmpty())
        return s;
        
        int x=s.pop();
        
       Stack<Integer> temp= deleteMid(s,size,current+1);
        
        if(current!=size/2)
         temp.push(x);
        
        return temp;
      
    } 
}

