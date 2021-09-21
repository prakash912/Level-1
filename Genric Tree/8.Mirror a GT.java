 public static void mirror(Node node){
    // write your code here
    int left=0;
    int right=node.children.size()-1;
    while(left<right){
        Node ln=node.children.get(left);
        Node rn=node.children.get(right);
        node.children.set(left,rn);
        node.children.set(right,ln);
        
        left++;
        right--;
    }
    for(Node child:node.children)
    {
        mirror(child);
    }
  }
