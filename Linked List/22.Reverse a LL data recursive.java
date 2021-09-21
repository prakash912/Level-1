  public  void reverseDRHelper(Node node,int floor){
        if(node==null){
            return;
        }
        reverseDRHelper(node.next,floor+1);
        if(floor>=size/2){
            int temp=node.data;
            node.data=rleft.data;
            rleft.data=temp;
             rleft=rleft.next;
        
        }
       
    }
    Node rleft;
    public void reverseDR() {
      // write your code here
      rleft=head;
      reverseDRHelper(head,0);
      
    }
