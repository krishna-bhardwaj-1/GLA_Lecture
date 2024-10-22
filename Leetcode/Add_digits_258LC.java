package Leetcode;

public class Add_digits_258LC {
    public static void main(String[] args) {
        int num=0;
        System.out.println(sum_onedigit(num));
    }
    public static int sum_onedigit(int n){
        int sum=0;
        if(n<10) return n;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        if(sum>9) return sum_onedigit(sum);
        return sum;
    }
}
