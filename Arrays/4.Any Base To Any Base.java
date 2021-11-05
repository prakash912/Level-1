import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     
     int decimal=sourceTOdecimal( n, sourceBase);
     int ans=decimalTodest( decimal, destBase);
     
     System.out.println(ans);
   } 
   
    public static int sourceTOdecimal(int n, int b){
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
   
    public static int decimalTodest(int n, int b){
       // write code here
       
       int ans =0;
       int power=1;
       
       while(n>0){
           int dig=n%b;
           n=n/b;
           
           ans +=(dig*power);
           power= power *10;
       }
       return ans;
   }
   
   
  }
