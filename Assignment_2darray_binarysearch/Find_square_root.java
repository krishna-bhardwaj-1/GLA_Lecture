package Assignment_2darray_binarysearch;

import java.util.Scanner;

public class Find_square_root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(squaroot(num));
    }
    public static int squaroot(int num){
        int lo=1;
        int hi=num;
        int ans=1;
        while(lo<=hi){
            int mid= (lo+hi)/2;
            if(mid*mid==num){
                return mid;
            }
            else if(mid*mid<num){
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
