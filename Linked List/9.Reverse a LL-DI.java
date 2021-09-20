  private Node getNode(int idx){
         Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp;
    }

    public void reverseDI() {
      // write your code here
     int li=0;
     int ri=size-1;
    
     while(li<ri){
          
     Node left =getNode(li);
     Node right=getNode(ri);
     
     int temp=left.data;
     left.data =right.data;
     right.data=temp;
     
     li++;
     ri--;
     }
    }
