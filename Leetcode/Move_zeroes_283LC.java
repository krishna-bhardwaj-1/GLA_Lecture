package Leetcode;

import java.util.Arrays;

public class Move_zeroes_283LC {
    public static void main(String[] args) {
        int[] nums={0,1,2,0,3,4,0,2};
        System.out.println(Arrays.toString(movezero(nums)));
    }
    public static int[] movezero(int[] nums){
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[c]=nums[i];
                c++;
            }
        }
        while (c < nums.length) {
            nums[c] = 0;
            c++;
        }
        return nums;
    }
}
