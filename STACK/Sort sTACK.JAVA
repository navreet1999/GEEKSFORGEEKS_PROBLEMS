// https://practice.geeksforgeeks.org/problems/sort-a-stack/1

// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> st = new Stack<>();
        Stack<Integer> hp = new Stack<>();
        while(s.size() > 0)
        {
            int x = s.pop();
            if(st.isEmpty()){
              st.push(x);
            }
           else{
              if(st.peek() <= x){
                st.push(x);
              }
               else{
                 while(st.size() > 0 && st.peek() > x){
                    hp.push(st.pop());
                 }
                 st.push(x);
                 while(hp.size() > 0){
                    st.push(hp.pop());
                }
                }
            }
        }
        return st;
	}
}