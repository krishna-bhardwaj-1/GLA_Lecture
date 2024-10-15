package Lecture_10;

import java.util.Scanner;

public class Maximun_subarray_LC53 {
    public static void main(String[] args) {
        // { 2 3 -7 5 -1 7 }
        /*
        2                   3               -7          5       -1      7
        2 3                 3 -7            -7 5        5 -1    -1 7
        2 3 -7              3 -7 5          -7 5 -1     5 -1 7
        2 3 -7 5            3 -7 5 -1       -7 5 -1 7
        2 3 -7 5 -1         3 -7 5 -1 7
        2 3 -7 5 -1 7
         */
        Scanner sc=new Scanner(System.in);
        int[] arr={2,3,-7,5,-1,7};
        System.out.println(Maximum_Sum(arr));
    }
    public static int Maximum_Sum(int[] arr){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}
