import java.io.*;
import java.util.*;

class Interval {
    int buy;
    int sell;
}

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Stock obj = new Stock();
		    
		    obj.stockBuySell(arr, n);
		    System.out.println();
		}
	}
}
// } Driver Code Ends



class Stock{

    // Function to find the buy and sell days and print them
    static void stockBuySell(int price[], int n) {
        ArrayList<Interval> al=new ArrayList<>();
        int i=0,cnt=0;
        while(i<n-1){
            while(i<n-1&&price[i]>=price[i+1])
            i++;
            if(i==n-1)
            break;
            Interval e=new Interval();
            e.buy=i++;
            while(i<n-1&&price[i]<=price[i+1])
            i++;
            e.sell=i;
            al.add(e);
            cnt++;
        }
        if(cnt==0)
        System.out.print("No Profit");
        else{
            for(i=0;i<al.size();i++)
            System.out.print("("+al.get(i).buy+" "+al.get(i).sell+") ");
        }
    } 
}
