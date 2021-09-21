 public static int addListHelper(Node one,int pv1,Node two,int pv2,LinkedList res){
        if(one==null && two ==null){
            return 0;
        }
        int data=0;
        if(pv1>pv2){
            int oc=addListHelper(one.next,pv1-1,two,pv2,res);
            data=one.data+oc;
        }else if(pv1<pv2){
            int oc=addListHelper(one,pv1,two.next,pv2-1,res);
            data=two.data+oc;
        }else{
           int oc=addListHelper(one.next,pv1-1,two.next,pv2-1,res);
           data=one.data+two.data+oc;
        }
        int nd=data%10;
        int nc=data/10;
        
        res.addFirst(nd);
        return nc;
    }

    public static LinkedList addTwoLists(LinkedList one, LinkedList two) {
      // write your code here
      LinkedList res=new LinkedList();
      int oc=addListHelper(one.head,one.size,two.head,two.size,res);
      if(oc>0){
          res.addFirst(oc);
      }
      return res;
      
    }
