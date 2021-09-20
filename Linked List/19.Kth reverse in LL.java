 public void kReverse(int k) {
      // write your code here
      LinkedList prev=null;
      while(this.size>0){
          LinkedList cur=new LinkedList();
          if(this.size>=k){
              for(int i=0;i<k;i++){
                  int val=this.getFirst();
                  this.removeFirst();
                  cur.addFirst(val);}
              }else {
                  int os=this.size();
                  for(int i=0;i<os;i++){
                  int val=this.getFirst();
                  this.removeFirst();
                  cur.addLast(val); 
                  }
              }
              if(prev==null){
                  prev=cur;
              }else{
                  prev.tail.next=cur.head;
                  prev.tail=cur.tail;
                  prev.size+=cur.size;
                  
              }
          }
          this.head=prev.head;
          this.tail=prev.tail;
          this.size=prev.size;
      }
