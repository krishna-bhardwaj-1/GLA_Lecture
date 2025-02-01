package Assignment_recursion;

import java.util.Scanner;

public class replaceallpi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0) {
            String s = sc.next();
            StringBuilder ans = new StringBuilder();
            sol(s, 0, ans);
        }
    }
    private static void sol(String s,int cr,StringBuilder ans){
        if(cr==s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(cr)=='p' && s.charAt(cr+1)=='i'){
            ans.append("3.14");
            cr+=2;
        }
        else {
            ans.append(s.charAt(cr));
            cr+=1;
        }
        sol(s,cr,ans);
    }
}
