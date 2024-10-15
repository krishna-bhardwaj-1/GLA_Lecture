package Assignment_6498;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        while(n>1) {
            c = a + b;
            a = b;
            b = c;
            n--;
        }
        System.out.println(c);
    }
}
