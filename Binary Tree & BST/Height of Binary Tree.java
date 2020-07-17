class Tree
{
    // return the Height of the given Binary Tree
    int height(Node root) 
    {
         // Your code here
         
         if(root==null)
         return 0;
        else
        {
            int l=height(root.left);
            int r=height(root.right);
            
            if(l>r)
            return l+1;
            else 
            return r+1;
        }
    }   
}
