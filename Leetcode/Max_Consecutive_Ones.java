package Leetcode;

public class Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,0,0,0,1,1,0,1,1,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) c++;
            else{
                max=Math.max(max,c);
                c=0;
            }
        }
        max=Math.max(max,c);
        return max;
    }
}
