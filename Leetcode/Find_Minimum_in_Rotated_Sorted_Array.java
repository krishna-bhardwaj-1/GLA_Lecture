package Leetcode;
/*
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 */
public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        System.out.println(findmin(nums));
    }
    public static int findmin(int[] nums){
        int lo=0;
        int hi=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(nums[lo]<=nums[hi]){
                ans=Math.min(ans,nums[lo]);
                return ans;
            }
            if(nums[lo]<=nums[mid]){
                ans=Math.min(ans,nums[lo]);
                lo=mid+1;
            }
            else {
                ans=Math.min(ans,nums[mid]);
                hi=mid-1;
            }
        }
        return ans;
    }
}
