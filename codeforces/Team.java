package codeforces;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while (n-->0){
            int one=0;
            int a=sc.nextInt();
            if(a==1) one++;
            int b=sc.nextInt();
            if(b==1) one++;
            int c=sc.nextInt();
            if (c==1) one++;
            if(one>=2) count++;
        }
        System.out.println(count);
    }
}
