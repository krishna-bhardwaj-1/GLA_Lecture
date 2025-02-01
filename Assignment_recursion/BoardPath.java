package Assignment_recursion;

import java.util.Scanner;

public class BoardPath {
    static int c;
    public static void main(String[] args) {
        c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int faces=sc.nextInt();
        sol(n,0,faces,"");
        System.out.print("\n"+c);
    }
    private static void sol(int n,int curr,int faces,String ans){
        if(curr>n){
            return;
        }
        if(curr==n){
            c++;
            System.out.print(ans+" ");
            return;
        }
        for(int dice=1;dice<=faces;dice++){
            sol(n,curr+dice,faces,ans+dice);
        }
    }
}
