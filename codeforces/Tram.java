package codeforces;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int passenger=0;
        int capacity=0;
        while (n-->0){
            int out=sc.nextInt();
            int in=sc.nextInt();
            passenger=passenger+in-out;
            capacity=Math.max(capacity,passenger);
        }
        System.out.println(capacity);
    }
}
