  public void addAt(int idx, int val){
      // write your code here
      if(idx<0 || idx>size){
          System.out.println("Invalid arguments");
      }else if(idx==0){
          addFirst(val);
      }else if(idx==size){
          addLast(val);
      }else{
          Node node =new Node();
          node.data=val;
          Node temp=head;
          for(int i=0;i<idx-1;i++){
              temp=temp.next;
          }
          node.next=temp.next;
          temp.next=node;
          
          size++;
      }
    }
