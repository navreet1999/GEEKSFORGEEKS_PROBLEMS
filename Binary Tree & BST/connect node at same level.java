class Tree
{
    /*
    Node class is Defined as follows:
    class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    */
    public static void connect(Node p)
        {
            // code here.
            if(p==null)
            return ;
            
            Queue<Node> q=new LinkedList<Node>();
            
            q.add(p);
            q.add(null);
            
            while(!q.isEmpty())
            {
                Node temp=q.peek();
                q.remove();
                
                if(temp!=null)
                {
                    temp.nextRight = q.peek();
                    
                    if(temp.left!=null)
                      q.add(temp.left);
                    if(temp.right!=null)
                    q.add(temp.right);
                    
                }
                else if(!q.isEmpty())
                q.add(null);
                
            }
        
        }
}