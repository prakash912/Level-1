
    public void reversePI(){
      // write your code here
      Node prv=null;
      Node cur=head;
      
      while(cur !=null){
          Node next=cur.next;
          
          cur.next=prv;
          
          prv=cur;
          cur=next;
      }
      Node temp=head;
      head=tail;
      tail=temp;
    }
