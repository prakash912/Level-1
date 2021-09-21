 public static void levelOrderLinewise(Node node){
    // write your code here
    Queue<Node> q1=new ArrayDeque<>();
    Queue<Node> q2=new ArrayDeque<>();
    q1.add(node);
    while(q1.size()>0 || q2.size()>0){
        while(q1.size()>0){
            Node rn=q1.remove();
            System.out.print(rn.data+" ");
            for(Node child:rn.children){
                q2.add(child);
            }
        }
        System.out.println();
        q1=q2;
        q2=new ArrayDeque<>();
    }
  }
