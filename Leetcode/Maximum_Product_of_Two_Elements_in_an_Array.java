package Leetcode;

import java.util.Arrays;

public class Maximum_Product_of_Two_Elements_in_an_Array {
    public static void main(String[] args) {
        int[] nums={3,4,5,2};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int last=nums[nums.length-1];
        int seclast=nums[nums.length-2];
        return (last-1)*(seclast-1);
    }
}
