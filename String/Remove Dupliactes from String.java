
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void logic(String str)
    {
        LinkedHashSet<Character> l=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
        {
            l.add(str.charAt(i));
        }
        
        for(Character ch : l)
        System.out.print(ch);
    }
	public static void main (String[] args) {
	  int t;
	  Scanner sc=new Scanner(System.in);
	  t=sc.nextInt();
	  sc.nextLine();
	  for(int i=0;i<t;i++)
	  {
	      //nextLine();
	      String str;
	      str=sc.nextLine();
	   
	      
	      logic(str);
	     System.out.println();
	     // System.out.println(s);
	  }
	}
}