  public static void levelOrder(Node node){
    // write your code here
    Queue<Node> q=new ArrayDeque<>();
    q.add(node);
    
    while(q.size()!=0)
    {
        Node rn=q.remove();
        System.out.print(rn.data+" ");
        for(Node child:rn.children){
            q.add(child);
        }
       
    }
     System.out.print(".");
  }
