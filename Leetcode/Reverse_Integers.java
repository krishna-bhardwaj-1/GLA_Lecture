package Leetcode;

public class Reverse_Integers {
    public static void main(String[] args) {
        int n=-120;
        System.out.println(reverse(n));
    }
    public static int reverse(int n) {
        int c=0;
        int x=n;
        if(n<0) x=-x;
        while(x>0){
            x/=10;
            c++;
        }
        int p=n;
        if(n<0) p=-p;
        int sum=0;
        while(p>0){
            int rem=p%10;
            sum+=rem*Math.pow(10,--c);
            p/=10;
        }
        if(sum>=2147483647) return 0;
        if(n<0) return -sum;
        return sum;
    }
}
