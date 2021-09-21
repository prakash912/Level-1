 public static int size(Node node){
    // write your code here
    int sz=1;
    for(Node child:node.children){
        sz+=size(child);
    }
    return sz;
  }
