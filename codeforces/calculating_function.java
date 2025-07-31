package codeforces;

import java.util.Scanner;

public class calculating_function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long x=Math.ceilDiv( n,2);
        long y=Math.floorDiv(n,2);
        System.out.println(((x*x)*-1)+(y*(y+1)));
    }
}
