package codeforces;

import java.util.Scanner;

public class capitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String sb=s.substring(0, 1).toUpperCase()+s.substring(1);
        System.out.println(sb);
    }
}
