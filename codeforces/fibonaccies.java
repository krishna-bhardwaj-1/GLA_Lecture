package codeforces;

import java.util.Scanner;

public class fibonaccies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0){
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int a4=sc.nextInt();
            int a5=sc.nextInt();
            int maxfibo=0;
            for(int a3=-300;a3<300;a3++){
                int fibocount=0;
                if(a4==a2+a3) fibocount++;
                if(a5==a3+a4) fibocount++;
                if(a3==a1+a2) fibocount++;
                maxfibo=Math.max(maxfibo,fibocount);
            }
            System.out.println(maxfibo);
        }
    }
}
