package codeforces;

import java.util.Scanner;

public class Stair_peak_neither {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a<b && b<c) {
                System.out.println("STAIR");
            }
            else if(a<b && b>c) System.out.println("PEAK");
            else System.out.println("NONE");
        }
    }
}
