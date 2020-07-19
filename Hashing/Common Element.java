import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
public static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int a = in.nextInt();
        for(int a0=0; a0<a; a0++) {
            int c=0;
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int n3 = in.nextInt();
            for(int i=0; i<n1; i++) {
                int num = in.nextInt();
                map.put(num, 1);
            }
            for(int i=0; i<n2; i++) {
                int num = in.nextInt();
                if(map.containsKey(num)) {
                    map.put(num, map.get(num)+1);
                }
            }
            Set<Integer> set = new HashSet<Integer>();
            for(int i=0; i<n3; i++) {
                int num = in.nextInt();
                if(map.containsKey(num)) {
                    if(map.get(num)>=2 && !set.contains(num)) {
                        c++;
                        set.add(num);
                        System.out.print(num+" ");
                    }
                }
            }
            if(c==0) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}