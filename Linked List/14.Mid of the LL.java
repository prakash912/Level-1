 public int mid(){
      // write your code here
      Node s=head;
      Node f=head;
      
      while(f.next != null && f.next.next != null){
          s=s.next;
          f=f.next.next;
      }
      
      return s.data;
    }
  }
