https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array/0

import java.util.*;

public class g21{
		public String comPre(String a, String b){
			int l=a.length();
			int m=b.length();

			String res="";

			for(int i=0,j=0;i<=l-1 && j<=m-1; i++,j++){
				char ch=a.charAt(i);
				if(ch==b.charAt(j)){
					res+=ch;
				}
				else
					break;
			}

			return res;
		}


		public String longPre(ArrayList<String> res){
			String pre=res.get(0);

			for(int i=1;i<res.size();i++)
				pre=comPre(pre,res.get(i));

			return pre;
		}


		public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		g21 g=new g21();

		int t=scan.nextInt();
		for(int w=0;w<t;w++){
			int n=scan.nextInt();
			scan.nextLine();
			String str=scan.nextLine();

			ArrayList<String> res=new ArrayList<String>();

			for(String s:str.split("\\s")){
				res.add(s);
			}


			String result=g.longPre(res);
			//System.out.println(result);
			if(result.length()!=0)
			    System.out.println(result);
			else
				System.out.println("-1");
				

		}
	}
}
