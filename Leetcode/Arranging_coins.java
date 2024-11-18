package Leetcode;

public class Arranging_coins {
    public static void main(String[] args) {
        int n=5;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {
        int lo=0;
        int hi=n;
        while(lo<=hi){
            long mid=(lo+hi)/2;
            long e=n-((mid*(mid+1))/2);
            if(e==0){
                return (int)mid;
            }
            else if(e<0){
                hi=(int)mid-1;
            }
            else{
                lo=(int)mid+1;
            }
        }
        return hi;
    }
}
