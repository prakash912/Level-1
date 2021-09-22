 public static boolean find(Node node, int data) {
    // write your code here
    if(node.data==data){
        return true;
    }
    for(Node child:node.children){
        boolean finc=find(child,data);
        if(finc==true){
            return true;
        }
    }
    return false;
  } 
