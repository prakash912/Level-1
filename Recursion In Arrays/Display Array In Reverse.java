// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print the elements of array from end to beginning each in a separate line.
// 4. For the above purpose complete the body of displayArrReverse function. Don't change the signature.
// Sample Input
// 5
// 3
// 1
// 0
// 7
// 5
// Sample Output                                            FIRST CALL FUNCTION WHEN IDX==ARR.LENGTH THEN WHEN RETURN TIME PRINT ARRAY
// 5
// 7
// 0
// 1
// 3
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        displayArrReverse(arr,0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        
          if(idx==arr.length)            //BASE CASE
        {
            return;
        }
     
        displayArrReverse(arr,idx+1);    //FAITH
        System.out.println(arr[idx]); 
      //   System.out.println(arr[0]); 
        
    }

}
