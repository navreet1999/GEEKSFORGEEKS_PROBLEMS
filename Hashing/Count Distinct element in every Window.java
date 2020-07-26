//  https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1

import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends




class Solution
{
    ArrayList<Integer> countDistinct(int a[], int n, int k)
    {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<k;i++)
        {
           map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        ans.add(map.size());
        
        //remaining element
        for(int i=k;i<a.length;i++)
        {
            //remove first element after the window slide
            if(map.get(a[i-k])==1)
               map.remove(a[i-k]);
            else //else remove the 1 occurence
               {
                   int value=map.get(a[i-k]);
                   map.put(a[i-k],value-1);
               }
            map.put(a[i], map.getOrDefault(a[i],0) +1);
            ans.add(map.size());

            
        }
        return ans;
    }
}

