package Leetcode;

import java.util.Arrays;

public class first_and_last_position_in_array {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int tar=8;
        System.out.println(Arrays.toString(searchRange(arr,tar)));
    }
    public static int[] searchRange(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]<target){
                i++;
            }
            else if(nums[j]>target){
                j--;
            }
            else {
                return new int[] {i,j};
            }
        }
        return new int[] {-1,-1};
    }
}
