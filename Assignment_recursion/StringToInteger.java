package Assignment_recursion;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sol(s,0,0);
    }
    private static void sol(String s,int cr,int num){
        if(cr==s.length()){
            System.out.print(num);
            return;
        }
        sol(s,cr+1,num*10+(s.charAt(cr)-'0'));
    }
}
