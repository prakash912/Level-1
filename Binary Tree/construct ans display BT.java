import java.util.*;

public  class Main{
    
    public static class Pair{
        Node node;
        int state;
        
        public Pair(Node node,int state){
            this.node = node;
            this.state = state;
        }
    }
    
    public static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
        }
    }
    public static Node construct(Integer[] arr){
      
        Stack<Pair> st=new Stack<>();
        Node root=new Node(arr[0]);
        st.push(new Pair(root,0));
      
        for(int i=1;i<arr.length;i++){
            Pair top=st.peek();
                if(arr[i]==null){
                    top.state++;
                    if(top.state==2){
                        st.pop();
                    }
                }else{
                    Node n1=new Node(arr[i]);
                if(top.state==0){
                    
                    top.node.left=n1;
                    top.state++;
                    
                }else{
                    top.node.right=n1;
                    st.pop();
                }
                
                st.push(new Pair(n1,0));
            }
        }
        
        return root;
        
    }
    public static void display(Node node){
        if(node==null){
            return ;
            
        }
        String str="";
        str+=node.left==null?". ":node.left.data+" ";
        str+=" <- "+ node.data+" -> ";
        str+=node.right==null?". ":node.right.data+" ";

       System.out.println(str);
       display(node.left);
       display(node.right);

    }
    
    public static void main(String[] args){
        Integer[] arr = {10, 20, 40, null, null, 50, 60, null, null, null,
                        30, 70, null, 80, null, null, 90, null, null};
        Node root = construct(arr);
        display(root);
    }
}
