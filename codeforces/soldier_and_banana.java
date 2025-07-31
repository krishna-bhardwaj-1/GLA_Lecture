package codeforces;

import java.util.Scanner;

public class soldier_and_banana {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int sum=k*(w*(w+1))/2;
        if(sum<=n) System.out.println(0);
        else System.out.println(sum-n);
    }
}
