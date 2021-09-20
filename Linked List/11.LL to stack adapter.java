
  public static class LLToStackAdapter {
    LinkedList<Integer> list;

    public LLToStackAdapter() {
      list = new LinkedList<>();
    }


    int size() {
      // write your code here
      return list.size();
    }

    void push(int val) {
      // write your code here
      list.addFirst(val);
    }

    int pop() {
      // write your code here
      if(size()==0){
          System.out.println("Stack underflow");
          return -1;
      }else{
          return list.removeFirst();
      }
    }

    int top() {
      // write your code here
       if(size()==0){
          System.out.println("Stack underflow");
          return -1;
      }else{
          return list.getFirst();
      }
    }
  }
