package Assignment_recursion;

import java.util.Scanner;

public class print_dec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printdec(n);
        printinc(n);
    }
    private static void printdec(int n){
        if(n==0){
            return;
        }
        if(n%2!=0) {
            System.out.println(n);
        }
        printdec(n-1);
    }
    private static void printinc(int n){
        if(n==0){
            return;
        }
        printinc(n-1);
        if(n%2==0) {
            System.out.println(n);
        }
    }
}
