	import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            
            int[] val=new int[n];
            for(int i=0;i<n;i++)
            {
                val[i]=sc.nextInt();
            }
            
            int[] wait=new int[n];
            for(int i=0;i<n;i++)
            {
                wait[i]=sc.nextInt();
            }
            int cap=sc.nextInt();
            
            int[] dp=new int[cap+1];
            dp[0]=0;
            
            for(int bagc=1;bagc<=cap;bagc++)
            {
                int max=0;
                for(int item=0;item<n;item++)
                {
                    if(wait[item]<=bagc)
                    {
                        int rbagc=bagc-wait[item];
                        int rbagcv=dp[rbagc];
                        int tbagv=rbagcv+val[item];
                        
                    if(tbagv>max)
                    {
                        max=tbagv;
                    }
                    }
                  
                }
                dp[bagc]=max;
            }
            System.out.println(dp[cap]);
	    }
	}
