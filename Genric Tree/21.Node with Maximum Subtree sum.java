  static int maxSubTreeSum=Integer.MIN_VALUE;
  static Node maxSumNode;
  public static int sum(Node node){
      int ans=node.data;
      for(Node child:node.children){
          ans+=sum(child);
      }
      if(ans>maxSubTreeSum){
          maxSubTreeSum=ans;
          maxSumNode=node;
      }
      return ans;
  }
