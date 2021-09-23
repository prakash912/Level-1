public static int size(Node node) {
    // write your code here
    if(node==null){
        return 0;
    }
    int lans=size(node.left);
    int rans=size(node.right);
    int ans=lans+rans+1;
    return ans;
    
  }

  public static int sum(Node node) {
    // write your code here
   if(node==null){
        return 0;
    }
    int lans=sum(node.left);
    int rans=sum(node.right);
    int ans=lans+rans+node.data;
    return ans;
    
  }

  public static int max(Node node) {
    // write your code here
     if(node==null){
        return Integer.MIN_VALUE;
    }
    int lans=max(node.left);
    int rans=max(node.right);
    int ans=Math.max(node.data,Math.max(lans,rans));
    return ans;
    
    
  }

  public static int height(Node node) {
    // write your code here
     if(node==null){
        return -1;
    }
    int lans=height(node.left);
    int rans=height(node.right);
    int ans=Math.max(lans,rans)+1;
    return ans;
    
  }
