package codeforces;

import java.util.Scanner;

public class bear_and_big_brother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=1;
        while (a*3<=b*2){
            a*=3;
            b*=2;
            i++;
        }
        System.out.println(i);
    }
}
