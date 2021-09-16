
Sample Input
4  //n
2
3   //coins
5
6
7  //amount
Sample Output
2  //combination



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int amount=sc.nextInt();
        System.out.println(ccc(arr,amount));
    }
    
    public static int ccc(int[]arr,int amount)
    {
        int[] dp=new int[amount+1];
        
        dp[0]=1;
        
        for(int i=0;i<arr.length;i++)
        {
            int coin=arr[i];
            
            for(int j=coin;j<dp.length;j++)
            {
                dp[j] +=dp[j-coin];
            }
        }
        return dp[amount];
    }
}
