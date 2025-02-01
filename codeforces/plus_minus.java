package codeforces;

import java.util.Scanner;

public class plus_minus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int max=Math.max(a,Math.max(b,c));
            int min=Math.min(a,Math.min(b,c));
            if(a>min && a<max){
                System.out.println(a);
            }
            else if(b<max && b>min){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }
    }
}
