 public static void predecessorAndSuccessor(Node node, int data) {
    // write your code here
    if(state==0){
        if(node.data !=data){
           predecessor=node; 
        }else{
            state=1;
        }
    }else if(state==1){
        successor=node;
        state=2;
    }
    
    
    
    
    
    for(Node child:node.children){
        predecessorAndSuccessor(child,data);
    }
  }
