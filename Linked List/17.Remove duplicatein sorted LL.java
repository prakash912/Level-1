  public void removeDuplicates(){
      // write your code here
      LinkedList res=new LinkedList();
      while(this.size()>0){
          int val=this.getFirst();
          this.removeFirst();
          
          if(res.size()==0 ||res.tail.data !=val){
              res.addLast(val);
          }
      }
      this.head=res.head;
      this.tail=res.tail;
      this.size=res.size();
    }
