package codeforces;

import java.util.Scanner;

public class ab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0){
            int num=sc.nextInt();
            int sum=0;
            while (num>0){
                sum+=(num%10);
                num/=10;
            }
            System.out.println(sum);
        }
    }
}
