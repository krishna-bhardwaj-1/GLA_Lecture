package codeforces;

import java.util.Scanner;

public class wrong_subtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        while (t-->0){
            if(n%10!=0) n--;
            else n/=10;
        }
        System.out.println(n);
    }
}
