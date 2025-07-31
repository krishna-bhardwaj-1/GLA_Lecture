package Assignment_recursion;

import java.util.Scanner;

public class Generate_binary_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0) {
            String s = sc.next();
            sol(s, "", 0, s.length());
        }
    }
    private static void sol(String s,String ans,int cr,int len){
        if(cr==len){
            System.out.print(ans+" ");
            return;
        }
        if(s.charAt(0)=='?'){
            sol(s.substring(1),ans+"0",cr+1,len);
            sol(s.substring(1),ans+"1",cr+1,len);
        }
        else {
            sol(s.substring(1),ans+s.charAt(0),cr+1,len);
        }
    }
}
