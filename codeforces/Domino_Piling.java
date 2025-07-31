package codeforces;

import java.util.Scanner;

public class Domino_Piling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(((m*n)-(m*n)%2)/2);
    }
}
