import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] price=new int[n];
        for(int i=0;i<n;i++)
        {
            price[i]=sc.nextInt();
        }
        int[] wt=new int[n];
        for(int i=0;i<n;i++)
        {
            wt[i]=sc.nextInt();
        }
        int cap=sc.nextInt();
        
        System.out.println(knapSack(price,wt,cap));
    }
    
    public static int knapSack(int[] price,int[] wt,int cap)
    {
        int[][] dp=new int[price.length+1][cap+1];
        
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                dp[i][j]=dp[i-1][j];
                if(j-wt[i-1]>=0)
                {
                    dp[i][j]=Math.max(dp[i][j],price[i-1]+dp[i-1][j-wt[i-1]]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
