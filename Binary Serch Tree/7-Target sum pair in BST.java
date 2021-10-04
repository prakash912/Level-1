 public static boolean find(Node node,int data){
      if(node==null){
          return false;
      }
      if(data>node.data){
          return find(node.right,data);
      }
      else if(data<node.data){
          return find(node.left,data);
      }else{
          return true;
      }
  }
  public static void travelAndPrint(Node root,Node node,int tar){
      if(node==null){
          return;
      }
      
      travelAndPrint(root,node.left,tar);
      int com=tar-node.data;
      if(node.data<com){
          if(find(root,com)==true){
              System.out.println(node.data+" "+com);
          }
      }
      
      travelAndPrint(root,node.right,tar);
  }
