//https://practice.geeksforgeeks.org/problems/consecutive-1s-not-allowed/0

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Consecutive1sNotAllowed{
    static  int findNo(int n ){
        if(n == 1)
            return 2;
        if( n == 2)
            return 3;
        int t[] = new int[n+1];
        t[1]= 2;
        t[2]= 3;

        for ( int i =3;i <= n; i++){
            t[i] = (t[i-1]+t[i-2])%1000000007;
        }
        return t[n]%1000000007;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while( tc -- > 0){
            int n = sc.nextInt();
        System.out.println(findNo(n));
    }
    }
}