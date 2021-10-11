  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
      // write your code here
      data.add(val);
      upheapify(data.size()-1);
    }
    
    public void upheapify(int ci){
        if(ci==0){
            return ;
        }
        int pi=(ci-1)/2;
        if(data.get(ci)<data.get(pi)){
            swap(ci,pi);
            upheapify(pi);
        }
    }
    
    public void swap(int i,int j){
        int ith=data.get(i);
        int jth=data.get(j);
        data.set(i,jth);
        data.set(j,ith);
    }

    public int remove() {
      // write your code here
       if(data.size()==0){
          System.out.println("Underflow");
          return -1;
      }
      swap(0,data.size()-1);
      int rv=data.remove(data.size()-1);
      downheapify(0);
      return rv;
      
    }
    
    public void downheapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        
        int minidx=pi;
        if(lci<data.size() && data.get(lci)<data.get(minidx)){
            minidx=lci;
        }
        
        if(rci<data.size() && data.get(rci)<data.get(minidx)){
            minidx=rci;
        }
        
        if(minidx !=pi){
            swap(pi,minidx);
            downheapify(minidx);
        }
    }

    public int peek() {
      // write your code here
      if(data.size()==0){
          System.out.println("Underflow");
          return -1;
      }
      return data.get(0);
    }

    public int size() {
      // write your code here
      return data.size();
    }
  }
