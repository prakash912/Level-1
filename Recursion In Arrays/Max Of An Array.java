// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the maximum of input.
// Sample Input
// 6
// 15
// 30
// 40
// 4
// 11
// 9
// Sample Output
// 40
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc =new Scanner(System.in);
          int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    int max=maxOfArray(arr,0);
    System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1)           //base case
        {
           return arr[idx];
        }
       // int max=arr[0];
        int m=maxOfArray(arr,idx+1);      ///faith
        if(m>arr[idx])
        {
          return m;
        }
        else
        {
            return arr[idx];
        }
    //    return max;
        
    }

}
