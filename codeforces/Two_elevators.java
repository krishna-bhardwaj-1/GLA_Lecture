package codeforces;

import java.util.Scanner;

public class Two_elevators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int i = 0;
            if (b < c) {
                i += (c - b);
                i += (c - 1);
            }
            else{
                i+=(b-1);
            }
            if ((a - 1) < (i)) System.out.println(1);
            else if((a-1)==i) System.out.println(3);
            else System.out.println(2);
            n--;
        }
    }
}
