  public static int max(Node node) {
    // write your code here
    if(node.right==null){
        return node.data;
    }else{
        return max(node.right);
    }
  }


  public static Node remove(Node node, int data) {
    // write your code here
    if(node==null){
        return null;
    }
    if(data>node.data){
    
    node.right=remove(node.right,data);
    return node;
    }else if(data<node.data){
        node.left= remove(node.left,data);
        return node;
    }else{
        if(node.left==null && node.right==null){
            return null;
        }else if(node.left==null){
            return node.right;
        }else if(node.right==null){
            return node.left;
        }else{
            int max=max(node.left);
            node.data=max;
            node.left=remove(node.left,max);
            return node;
        }
    }
  }
