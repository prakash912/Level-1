   public int kthFromLast(int k){
      // write your code here
      Node f=head;
      Node s=head;
      
      for(int i=0;i<k;i++){
          f=f.next;
      }
      while(f != tail){
          s=s.next;
          f=f.next;
      }
      return s.data;
    }
