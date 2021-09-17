Sample Input
4
2
3
5
6
7
Sample Output
5


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] coins=new int[n];
        for(int i=0;i<n;i++)
        {
            coins[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        
        int[] dp =new int[tar+1];
        dp[0]=1;
        
        for(int amount=1;amount<=tar;amount++)
        {
            for(int coin : coins)
            {
                if(coin<=amount)
                {
                    int rem=amount-coin;
                    dp[amount]+=dp[rem];
                }
            }
        }
        System.out.println(dp[tar]);
    }
}
