package Assignment_recursion;

import java.util.Scanner;

public class subsequence {
    static int c;
    public static void main(String[] args) {
        c=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sol(s,"");
        System.out.print("\n"+c);
    }
    private static void sol(String s,String ans){
        if(s.length()==0){
            c++;
            System.out.print(ans+" ");
            return;
        }
        char cc=s.charAt(0);
        sol(s.substring(1),ans);
        sol(s.substring(1),ans+cc);
    }
}
