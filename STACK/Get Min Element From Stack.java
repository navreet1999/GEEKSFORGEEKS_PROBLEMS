// { Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}


// } Driver Code Ends


class GfG
{
    int minEle;
    Stack<Integer> s = new Stack<Integer>();
    Stack<Integer> s2 =  new Stack<Integer>();
   
    int getMin()
    {
      if(s.isEmpty() || s2.isEmpty())
        return -1;
      else        
        return s2.peek();
    }

    int pop()
    {

      if(!s.isEmpty()){
        int x = s.pop();
        int y = s2.pop();  //s2 me se bhi pop krdo ta ki current min element check kre ske 
                           //bcz ye vala element to pop ho chuka hoga actuall stack se
        return x;
      }
      else
        return -1;
    }
   
    void push(int x)
    {

    if(s.isEmpty()){
      minEle = x;
      s.push(x);
      s2.push(x);
    }
    else{
        s.push(x);
        int y = s2.peek();

       // s2.push(y);

    if(x<y){
      s2.push(x);
    }
    else{
        s2.push(y);
        }

      }
    }
}

