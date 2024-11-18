package Leetcode;

public class Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        int[] arr={1,4,4};
        int target=4;
        System.out.println(minSubArrayLen(target, arr));
    }
    public static int minSubArrayLen(int target, int[] nums){
        int ans=nums.length;
        int c=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<=target){
                c++;
            }
            else {
                ans=Math.min(ans,c);
                sum=0;
                c=1;
            }
        }
        ans=Math.min(ans,c);
        if(sum<target){
            return 0;
        }
        return ans;
    }
}
