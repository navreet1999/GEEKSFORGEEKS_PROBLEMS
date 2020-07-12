// https://practice.geeksforgeeks.org/problems/parenthesis-checker/0

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
   public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       
       while(t-- >0)
       {
           String str=sc.next();
           if(valid(str)==1)
           System.out.println("balanced");
           else
           System.out.println("not balanced");
       }
   }
   
   public static int valid(String str)
   {
       Stack<Character> st=new Stack<Character>();
       for(int i=0;i<str.length();i++)
       {
            char ch=str.charAt(i);
            if(st.empty())
              st.push(ch);
            else if(ch=='['||ch=='('||ch=='{')
              st.push(ch);
            else
            {
                if( (ch==')'&& st.peek()=='(') || (ch==']'&& st.peek()=='[') || (ch=='}'&& st.peek()=='{'))
                st.pop();
                else
                 st.push(ch);
            }
       }
       if(st.empty())
       return 1;
       else
       return 0;
      
   }
}