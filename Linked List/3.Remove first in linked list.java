
    public void removeFirst(){
      // write your code here
      if(size==0){
          System.out.println("List is empty");
      }else if(size==1){
          head=tail=null;
          size=0;
      }else{
          head=head.next;
          size--;
      }
    }
