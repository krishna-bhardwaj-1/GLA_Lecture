package Leetcode;

public class Perfect_number {
    public static void main(String[] args) {
        int num=28;
        System.out.println(checkPerfectNumber(num));
    }
    public static boolean checkPerfectNumber(int num) {
        int factsum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                factsum+=i;
            }
        }
        return (num==factsum);
    }
}
