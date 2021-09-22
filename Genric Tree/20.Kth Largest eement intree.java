 public static int kthLargest(Node node, int k){
    // write your code here
    int data=Integer.MAX_VALUE;
     ceil=Integer.MAX_VALUE;
     floor=Integer.MIN_VALUE;
    for(int i=0;i<k;i++){
       ceilAndFloor(node,data);
       data=floor;
       floor=Integer.MIN_VALUE;
    }
    return data;
  }
