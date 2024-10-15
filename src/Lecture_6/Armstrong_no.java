package Lecture_6;

import java.util.Scanner;

public class Armstrong_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n,a=n,sum=0;
        int i=0;
        while(n>0){
            n/=10;
            i++;
        }
        while(c>0){
            int rem=c%10;
            sum+=Math.pow(rem,i);
            c/=10;
        }
        if(sum==a) System.out.println("True");
        else System.out.println("False");
    }
}
