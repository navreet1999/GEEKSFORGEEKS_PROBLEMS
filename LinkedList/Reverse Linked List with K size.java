class GfG
{
    public static Node reverse(Node node, int B)
    {
        //Your code here
        
    Node curr=node,nextt=null,prev=null;
     int count=0;
     if(B==1 || B==0)
     return node;
     
     while(curr!=null  && B>count)
     {
       
            
        nextt=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nextt;
        count++;
         
     }
      
      if(nextt!=null)
         node.next = reverse(nextt,B); 
   
      //
    //A=prev;
     
   return prev ; 
    }
}

