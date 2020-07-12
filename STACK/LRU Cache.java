// https://practice.geeksforgeeks.org/problems/lru-cache/1

// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

  public class LRUDesign {

    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            int capacity = Integer.parseInt(read.readLine());
            int queries = Integer.parseInt(read.readLine());
            LRUCache cache = new LRUCache(capacity);
            String str[] = read.readLine().trim().split(" ");
            int len = str.length;
            int itr = 0;

            for (int i = 0; (i < queries) && (itr < len); i++) {
                String queryType = str[itr++];
                if (queryType.equals("SET")) {
                    int key = Integer.parseInt(str[itr++]);
                    int value = Integer.parseInt(str[itr++]);
                    cache.set(key, value);
                }
                if (queryType.equals("GET")) {
                    int key = Integer.parseInt(str[itr++]);
                    System.out.print(cache.get(key) + " ");
                }
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// design the class in the most optimal way
class LRUCache {
 
   Map<Integer,Integer> map;
    int capacity;
    Deque<Integer> dq;
    /*Inititalize an LRU cache with size N */
    public LRUCache(int N) {
       capacity = N;
       map = new HashMap<>();
       dq = new LinkedList<>();
    }
    
    /*Returns the value of the key x if 
     present else returns -1 */
    public int get(int x) {
        if(!map.containsKey(x)) return -1;
        dq.remove(x);
        dq.addLast(x);
        return map.get(x);
    }
    
    /*Sets the key x with value y in the LRU cache */
    public void set(int x, int y) {
        if(!map.containsKey(x)) {
            if(dq.size() == capacity) {
                int key = dq.remove();
                map.remove(key);
            }
        } else {
            dq.remove(x);
        }
        dq.addLast(x);
        map.put(x, y);
    }
}
