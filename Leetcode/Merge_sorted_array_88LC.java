package Leetcode;

import java.util.Arrays;

public class Merge_sorted_array_88LC {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3;
        int n=3;
        int[] a=merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(a));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n;i++){
            nums1[m]=nums2[i];
            m++;
        }
        return nums1;
    }
}
