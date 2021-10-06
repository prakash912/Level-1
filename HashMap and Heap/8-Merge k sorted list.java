 public static class Pair implements Comparable<Pair>{
        int li;
        int di;
        int data;
        
        Pair(int li,int di,int data){
            this.li=li;
            this.di=di;
            this.data=data;
        }
        
        public int compareTo(Pair o){
            return this.data-o.data;
        }
    }
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();

      PriorityQueue<Pair>pq=new PriorityQueue<>();
      for(int i=0;i<lists.size();i++){
          Pair p=new Pair(i,0,lists.get(i).get(0));
          pq.add(p);
      }
      
      while(pq.size()>0){
          Pair p=pq.remove();
          rv.add(p.data);
          p.di++;
          
          if(p.di<lists.get(p.li).size()){
              p.data=lists.get(p.li).get(p.di);
              pq.add(p);
          }
      }

      return rv;
   }
