 public static Node linearize2(Node node){
    // write your code here
    if(node.children.size()==0){
        return node;
    }
    Node tail=linearize2(node.children.get(node.children.size()-1));
    while(node.children.size()>1){
        Node slkitail=linearize2(node.children.get(node.children.size()-2));
        slkitail.children.add(node.children.get(node.children.size()-1));
        node.children.remove(node.children.size()-1);
    }
    return tail;
  }
