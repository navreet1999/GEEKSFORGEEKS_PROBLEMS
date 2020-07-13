// { Driver Code Starts
import java.util.*;


class StackUsingQueues
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queues g = new Queues();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.push(a);
				}
				else if(QueryType == 2)
				System.out.print(g.pop()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}

// } Driver Code Ends


class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    // Your code here
	    if(q1.isEmpty()==true)
	     return -1;
	     int ans=q1.remove();
	     return ans;
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    // Your code here	
	    while(q1.isEmpty()==false)
	    {
	        q2.add(q1.remove());
	       
	    }
	    q1.add(a);
	    while(q2.isEmpty()==false)
	    {
	        q1.add(q2.remove());
	        
	    }
    }
}

