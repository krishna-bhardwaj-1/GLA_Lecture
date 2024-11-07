package Leetcode;

public class Count_primes_204LC {
    public static void main(String[] args) {
            int n=10;
            count(n);
    }
    public static void count(int n){
        if(n<2){
            System.out.println(0);
        }
        int[] prime=new int[n];
        for(int i=2;i<=n/2;i++){
            if(prime[i]==0){
                for(int j=i*i;j<n;j+=i){
                    prime[j]=1;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(prime[i]==count){
                System.out.println(i+" ");
            }
        }
    }
}
