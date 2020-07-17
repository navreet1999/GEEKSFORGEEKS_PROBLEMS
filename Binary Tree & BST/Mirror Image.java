class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    static boolean isMirror(Node node1, Node node2)  
    { 
        // if both trees are empty, then they are mirror image 
        if (node1 == null && node2 == null) 
            return true; 
   
        if (node1 != null && node2 != null && node1.data == node2.data) 
            return (isMirror(node1.left, node2.right) 
                    && isMirror(node1.right, node2.left)); 
   
        return false; 
    } 
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        return isMirror(root, root);
    }
}



//another method

class Solution {
    void swap(TreeNode curr)
    {
        if(curr==null)
            return;
        swap(curr.left);
        swap(curr.right);
        
        TreeNode temp;
        temp=curr.left;
        curr.left=curr.right;
        curr.right=temp;
    }
    public TreeNode invertTree(TreeNode root) {
        
        swap(root);
        return root;
        
    }
}
