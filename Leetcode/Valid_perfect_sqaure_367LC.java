package Leetcode;

public class Valid_perfect_sqaure_367LC {
    public static void main(String[] args) {
        int num=225;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
            if(num<1) return false;
            long lo=1;
            long hi=num;
            while(lo<=hi){
                long mid=(lo+hi)/2;
                if(mid*mid==num){
                    return true;
                }
                else if(mid*mid>num){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            return false;
    }
}
