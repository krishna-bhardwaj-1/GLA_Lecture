package Assignment_6498;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextByte();
        int b=sc.nextByte();
        while(b%a!=0){
            int rem=b%a;
            b=a;
            a=rem;
        }
        System.out.println(a);
    }
}
