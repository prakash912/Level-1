 private boolean isPalindromeHelper(Node right){
        if(right==null){
            return true;
        }
     boolean rres=isPalindromeHelper(right.next);
     if(rres==false){
         return false;
     }else if(pleft.data !=right.data){
         return false;
     }else{
         pleft=pleft.next;
         return true;
     }
    }
    Node pleft;
    public boolean IsPalindrome() {
      // write your code here
      pleft=head;
      return isPalindromeHelper(head);
      
    }
