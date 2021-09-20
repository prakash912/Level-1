 public static Node midNode(Node head,Node tail){
        Node f=head;
        Node s=head;
        while(f!=tail && f.next !=tail){
            f=f.next.next;
            s=s.next;
        }
        return s;
        
    }

    public static LinkedList mergeSort(Node head, Node tail){
      // write your code here
      if(head==tail){
          LinkedList br=new LinkedList();
          br.addLast(head.data);
          return br;
      }
      Node mid=midNode(head,tail);
      LinkedList fsh=mergeSort(head,mid);
      LinkedList ssh=mergeSort(mid.next,tail);
      LinkedList c1=LinkedList.mergeTwoSortedLists(fsh,ssh);
      return c1;
    }
  
