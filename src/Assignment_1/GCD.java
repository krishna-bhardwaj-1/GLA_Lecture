package Assignment_1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b%a!=0){
            int rem=b%a;
            b=a;
            a=rem;
        }
        System.out.println(a);
    }
}
