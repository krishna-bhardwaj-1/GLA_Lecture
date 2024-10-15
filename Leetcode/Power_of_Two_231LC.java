package Leetcode;

public class Power_of_Two_231LC {
    public static void main(String[] args) {
        int n=1;
        System.out.println(valid(n));
    }
    public static boolean valid(int n){
        long i=1l;
        while(i<n){
            i=i*2;
        }
        return i==n;
    }
}
