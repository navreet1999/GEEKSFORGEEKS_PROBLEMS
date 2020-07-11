//https://practice.geeksforgeeks.org/problems/rearrange-a-linked-list/1

// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            head = new gfg().rearrangeEvenOdd(head);
            printList(head); 
            t--;
        }
    } 
} 
// } Driver Code Ends


/*

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class gfg
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns new head of linked List.
    Node rearrangeEvenOdd(Node head)
    {
         
         if(head == null || head.next == null) return head;
        Node oddPointer = head;
    Node evenPointer = head.next;
        Node even = head.next;
        while(evenPointer != null && evenPointer.next != null){
            oddPointer.next = oddPointer.next.next;
            oddPointer = oddPointer.next;
            evenPointer.next = evenPointer.next.next;
            evenPointer = evenPointer.next;
        }
        oddPointer.next = even;
        return head;
     }
}
