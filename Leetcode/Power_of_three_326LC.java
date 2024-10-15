package Leetcode;

public class Power_of_three_326LC {
    public static void main(String[] args) {
        int n=9;
        System.out.println(valid(n));
    }
    public static boolean valid(int n){
        long i=1l;
        while(i<n){
            i=i*3;
        }
        return i==n;
    }
}
