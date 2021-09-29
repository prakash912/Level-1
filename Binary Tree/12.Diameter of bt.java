  static int tilt = 0;
  public static int tilt(Node node){
    if(node == null){
      return 0;
    }

    int ls = tilt(node.left);
    int rs = tilt(node.right);
    int ts = ls + rs + node.data;
    
    tilt += Math.abs(ls - rs);

    return ts;
  }
