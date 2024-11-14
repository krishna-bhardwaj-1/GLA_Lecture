package Leetcode;

import java.util.Arrays;

public class Third_Maximum_Number {
    public static void main(String[] args) {

    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=nums[i-1]){
                c++;
            }
            if(c==3){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}
