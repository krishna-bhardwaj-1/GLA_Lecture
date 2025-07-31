package codeforces;

import java.util.Scanner;

public class SoftDrinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();

        int milk=k*l;
        int milfsuff=milk/nl;

        int lime=c*d;

        int salt=p/np;

        System.out.println(Math.min(milfsuff,Math.min(lime,salt))/n);
    }
}
