http://pepcoding.com/resources/ojquestionresource/images/goldmine.JPEG

Sample Input
6
6
0 1 4 2 8 2
4 3 6 5 0 4
1 2 4 1 4 6
2 0 7 3 2 2
3 1 5 9 2 4
2 7 0 8 5 1
Sample Output
33


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(goldMine(arr));
    }
    
    public static int goldMine(int[][] arr)
    {
        int[][] dp=new int[arr.length][arr[0].length];
        
        for(int j=arr[0].length-1;j>=0;j--)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(j==arr[0].length-1)
                {
                  dp[i][j]=arr[i][j]; 
                }
                else if(i==0)
                {
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
                }
                else if(i==arr.length-1)
                {
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
                }
                else{
                  dp[i][j]=arr[i][j]+Math.max(dp[i-1][j+1],Math.max(dp[i][j+1],dp[i+1][j+1]));  
                }
            }
        }
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans=Math.max(ans,dp[i][0]);
        }
        return ans;
    }

}
