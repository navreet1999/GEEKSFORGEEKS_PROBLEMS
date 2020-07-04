//   https://practice.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence/0/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		      a[i]=sc.nextInt();
		      
		      System.out.println(sum(a));
		}
	}
	public static int sum(int arr[]){
        int T[] = new int[arr.length];

        for (int i = 0; i < T.length; i++) {
            T[i] = arr[i];
        }

        for(int i=1; i < T.length; i++){
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[i]){
                    T[i] = Math.max(T[i], T[j] + arr[i]);
                }
            }
        }

        int max = T[0];
        for (int i=1; i < T.length; i++){
            if(T[i] > max){
                max = T[i];
            }
        }
        return max;
    }
    
}