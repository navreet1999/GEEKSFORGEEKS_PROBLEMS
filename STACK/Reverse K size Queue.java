// { Driver Code Starts
//Initial Template for Java

import java.util.*;
class ModifyQueue{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Queue<Integer> q=new LinkedList<>();
            while(n-->0){
                q.add((int)sc.nextInt());
            }
            GfG g=new GfG();
            Queue<Integer> ans=g.modifyQueue(q,k);
            while(!ans.isEmpty()){
                int a=ans.peek();
                ans.poll();
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class GfG
{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
      //add code here.
       if(q.isEmpty() || k>q.size())
        return q;
      
      if(k<=0)
        return q;
        
      Stack<Integer> s=new Stack<Integer>();
      
      for(int i=0;i<k;i++)
      {
          s.push(q.peek());
          q.remove();
      }
      
      while(!s.isEmpty())
      {
          q.add(s.peek());
          s.pop();
      }
       
       for(int i=0;i<q.size()-k;i++)
       {
           q.add(q.peek());
           q.remove();
       }
       
       return q;
    }
}
