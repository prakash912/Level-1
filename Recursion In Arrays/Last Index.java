// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number x. 
// 4. You are required to find the last index at which x occurs in array a.
// 5. If x exists in array, print the last index where it is found otherwise print -1.
// Sample Input
// 6
// 15
// 11
// 40
// 4
// 4
// 9
// 4
// Sample Output
// 4
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
        int x=sc.nextInt();
        int idx=arr.length-1;
        int fi=lastIndex(arr,idx, x);
        System.out.println(fi);
    }

    public static int lastIndex(int[] arr, int idx, int x){
          if(idx<0)
        {
            return -1;
        }
      
        if(arr[idx]==x)
        {
            return idx;
        }
        else
        {
              int fi=lastIndex(arr,idx-1,x);
            return fi;
        }
    }

}
