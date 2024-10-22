package Leetcode;

public class Fibonacci_Number_509LC {
    public static void main(String[] args) {
        int n=4;
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        int a=0,b=1,c=0;
        if(n==0) return a;
        else if(n==1||n==2) return b;
        while(n-->1){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
