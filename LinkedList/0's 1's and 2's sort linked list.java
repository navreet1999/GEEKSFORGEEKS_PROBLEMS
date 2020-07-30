//https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1

class LinkedList
{
    static Node segregate(Node head)
    {
        // add your code here
        Node i = head;

while(i.next != null) {
Node j = i.next;
while(j != null) {
if(i.data > j.data) {
int temp = i.data;
i.data = j.data;
j.data = temp;
}
j = j.next;
}
i = i.next;
}

return head;
    }
}


