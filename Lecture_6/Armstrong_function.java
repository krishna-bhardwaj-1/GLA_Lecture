package Lecture_6;

import java.util.Scanner;

public class Armstrong_function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Armstrong_number(n));
    }
    public static boolean Armstrong_number(int n){
        int c=n;
        int cod=Countofdigit(n);
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=(int)(sum+Math.pow(rem,cod));
            n/=10;
        }
        return (sum==c);
    }
    public static int Countofdigit(int n){
        int c=0;
        while(n>0){
            n/=10;
            c++;
        }
        return c;
    }
}
