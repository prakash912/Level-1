 static ArrayList<Integer> path;
  public static boolean find(Node node, int data){
    // write your code here
    if(node==null){
        return false;
    }
    
    if(node.data==data){
        path.add(node.data);
        return true;
    }
    
    boolean filc=find(node.left,data);
    if(filc){
        path.add(node.data);
        return true;
    }
    
    boolean firc=find(node.right,data);
    if(firc){
        path.add(node.data);
        return true;
    }
    
    return false;
  }
