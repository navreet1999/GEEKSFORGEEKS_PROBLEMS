class Tree
{
    static int maxLevel=0;
    void left(Node root,int level)
    {
        if(root==null)
        return ;
        
        if(maxLevel<level)
         {
             System.out.print(root.data+" ");
             maxLevel=level;
         }
         
        left(root.left,level+1);
        left(root.right,level+1);
        
        
    }
    void leftView(Node root)
    {
      // Your code here
      maxLevel=0;
      left(root,1);
    }
}