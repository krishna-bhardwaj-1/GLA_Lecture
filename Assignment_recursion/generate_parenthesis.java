package Assignment_recursion;

import java.util.Scanner;

public class generate_parenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print_parenthesis(n,0,0,"");
    }
    private static void print_parenthesis(int n,int oc,int cc,String ans){
        if(oc==n && cc==n){
            System.out.print(ans);
            return;
        }
        if(oc<n){
            print_parenthesis(n,oc+1,cc,ans+"(");
        }
        if(oc>cc){
            print_parenthesis(n,oc,cc+1,ans+")");
        }
    }
}
