import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int p=0;
      int ans=0;
      
      while(n>0){
          int dig=n%10;
          n=n/10;
          int mul=(int)Math.pow(b,p);
          ans +=(dig*mul);
          p +=1;
      }
      return ans;
   }
  }
