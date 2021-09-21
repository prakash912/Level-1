 private void reversePRHelper(Node node){
      // write your code here
      if(node==null)
      {
          return;
      }
      reversePRHelper(node.next);
      if(node==tail){
          
      }else{
          node.next.next=node;
      }
    }

    public void reversePR(){
      // write your code here
      reversePRHelper(head);
      head.next=null;
      Node temp=head;
      head=tail;
      tail=temp;
    }
