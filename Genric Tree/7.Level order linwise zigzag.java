
  public static void levelOrderLinewiseZZ(Node node){
    // write your code here
    Stack<Node> ms=new Stack<>();
     ms.push(node);
     int level=1;
    Stack<Node> cs=new Stack<>();
   
    
    while(ms.size()>0){
        node=ms.pop();
        System.out.print(node.data+" ");
        if(level%2==1){
            for(int i=0;i<node.children.size();i++){
                Node child=node.children.get(i);
                cs.push(child);
                
            }
        }else{
             for(int i=node.children.size()-1;i>=0;i--){
                Node child=node.children.get(i);
                cs.push(child);
                
            }
        }
        if(ms.size()==0){
            ms=cs;
            cs=new Stack<>();
            level++;
            System.out.println();
        }
    }
