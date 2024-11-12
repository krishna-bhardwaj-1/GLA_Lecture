package Assignment_2darray_binarysearch;

import java.util.Scanner;

public class Kth_root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i=1;
        while (i++<=t) {
            long n=sc.nextLong();
            long k=sc.nextLong();
            System.out.println(kthroot(n, k));
        }
    }
    public static long kthroot(long n,long k){
        long lo=1;
        long hi=n;
        long ans=1;
        while(lo<=hi){
            long mid= (lo+hi)/2;
            long val= (long) Math.pow(mid,k);
            if(val==n){
                return mid;
            }
            else if(val<n){
                ans=mid;
                lo=mid+1;
            }
            else {
                hi=mid-1;
            }
        }
        return ans;
    }
}
