import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn =new Scanner(System.in);
    int n1=scn.nextInt();
    int[] a1=new int[n1];
    for(int i=0;i<n1;i++){
        a1[i]=scn.nextInt();
    }
    
     int n2=scn.nextInt();
    int[] a2=new int[n2];
    for(int i=0;i<n2;i++){
        a2[i]=scn.nextInt();
    }
    
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<a1.length;i++){
        set.add(a1[i]);
    }
    
    for(int val:a2){
        if(set.contains(val)){
            System.out.println(val);
            set.remove(val);
        }
    }
 }

}
