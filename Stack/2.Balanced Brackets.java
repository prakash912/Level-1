import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' ||ch=='{' ||ch=='['){
                st.push(ch);
            }else if(ch==')'){
              boolean val=handle(st,'(');
              if(val==false){
                  System.out.println(false);
                  return;
              }
            }else if(ch=='}'){
                 boolean val=handle(st,'{');
              if(val==false){
                  System.out.println(false);
                  return;
              }
            }else if(ch==']'){
                 boolean val=handle(st,'[');
              if(val==false){
                  System.out.println(false);
                  return;
              }
            }else{
                
            }
        }
        if(st.size()==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static boolean handle(Stack<Character> st,char cha){
         if(st.size()==0){
                   return false;
               }else if(st.peek() !=cha){
                   return false;
               }else{
                   st.pop();
                   return true;
               }
    }

}
