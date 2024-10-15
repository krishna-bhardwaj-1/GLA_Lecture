package codeforces;

import java.util.Scanner;

public class Divisibility_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a%b==0) System.out.println(0);
            else{
                System.out.println(b-(a%b));
            }
            n--;
        }
    }
}
