package codeforces;

import java.util.Scanner;

public class subtractMinSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<n;i++) {
                nums[i]=sc.nextInt();
            }

            int i=1;
            for(;i<n;i++) {
                int x=Math.min(nums[i-1], nums[i]);
                nums[i-1]-=x;
                nums[i]-=x;
                if(nums[i]>=nums[i-1]) {
                    continue;
                }
                else {
                    System.out.println("NO");
                    break;
                }
            }
            if(i==n) {
                System.out.println("YES");
            }
        }
    }
}
