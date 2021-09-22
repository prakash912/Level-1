 static int diameter;
  public static int height(Node node){
      int maxh=-1;
      int smaxh=-1;
      for(Node child:node.children){
          int ch=height(child);
          if(ch>maxh){
              smaxh=maxh;
              maxh=ch;
          }else if(ch>smaxh){
              smaxh=ch;
          }
      }
      diameter=Math.max(diameter,maxh+smaxh+2);
      return maxh+1;
      
  }
