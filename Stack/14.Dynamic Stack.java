
    // change the code of this function according to question
    void push(int val) {
      if (tos == data.length - 1) {
        int[] ndata=new int[2*data.length];
        for(int i=0; i<data.length;i++){
            ndata[i]=data[i];
        }
        data=ndata;
        
        tos++;
        data[tos]=val;
      } else {
        tos++;
        data[tos] = val;
      }
    }
