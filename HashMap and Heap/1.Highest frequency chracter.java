import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        int maxf=0;
        char mfc='a';
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(map.containsKey(ch)==true){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
            
            if(map.get(ch)>maxf){
                maxf=map.get(ch);
                mfc=ch;
            }
        }
        
        System.out.println(mfc);
    }

}
