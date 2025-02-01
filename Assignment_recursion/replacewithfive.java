package Assignment_recursion;

import java.util.Scanner;

public class replacewithfive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder ans=new StringBuilder();
        sol(s,0,ans);
    }
    private static void sol(String s,int cr,StringBuilder ans){
        if(cr==s.length()){
            System.out.print(ans);
            return;
        }
        if(s.charAt(cr)=='0'){
            ans.append("5");
        }
        else {
            ans.append(s.charAt(cr));
        }
        sol(s,cr+1,ans);
    }
}
