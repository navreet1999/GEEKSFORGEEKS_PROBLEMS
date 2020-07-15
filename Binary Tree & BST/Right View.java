class Tree
{
    static int maxLevel=0;
    void right(Node root,int level)
    {
        if(root==null)
        return ;
        
        if(maxLevel<level)
         {
             System.out.print(root.data+" ");
             maxLevel=level;
         }
         
      
        right(root.right,level+1);
        right(root.left,level+1);
        
        
    }
    void rightView(Node root)
    {
      // Your code here
      maxLevel=0;
      right(root,1);
    }
    
}
