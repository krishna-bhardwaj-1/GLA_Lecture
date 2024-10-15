package Leetcode;

public class Power_of_four_342LC {
    public static void main(String[] args) {
        int n=16;
        System.out.println(valid(n));
    }
    public static boolean valid(int n){
        long i=1l;
        while(i<n){
            i=i*4;
        }
        return i==n;
    }
}
