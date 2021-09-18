import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int mpist=0;
        int least=arr[0];
        int[] dpL=new int[arr.length];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<least)
            {
                least=arr[i];
            }
            mpist=arr[i]-least;
            
            if(mpist>dpL[i-1])
            {
                dpL[i]=mpist;
            }else{
                dpL[i]=dpL[i-1];
            }
        }
        
        // Max profit if BOUGHT today
        
        int mpibt=0;
        int max=arr[arr.length-1];
        int[] dpR=new int[arr.length];
        
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>max){
                max=arr[i];
            }
            mpibt=max-arr[i];
            
            if(mpibt>dpR[i+1])
            {
                dpR[i]=mpibt;
            }else{
                dpR[i]=dpR[i+1];
            }
        }
        
        int op=0;
        for(int i=0;i<arr.length;i++){
            if(dpL[i]+dpR[i]>op){
                op=dpL[i]+dpR[i];
            }
        }
        System.out.println(op);
    }
    

}
