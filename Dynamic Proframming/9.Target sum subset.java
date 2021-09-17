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
        
        int target=sc.nextInt();
        
        System.out.println(tss(arr,target));
    }
    
    public static boolean tss(int[] arr,int target)
    {
        boolean[][] dp=new boolean[arr.length+1][target+1];
        
        for(int i=0;i<arr.length;i++)
        {
            dp[i][0]=true;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                dp[i][j]=dp[i-1][j];
                if(dp[i][j]==false  && j-arr[i-1]>=0)
                {
                    dp[i][j]=dp[i-1][j-arr[i-1]];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
