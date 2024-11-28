package Leetcode;

public class Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(target, arr));
    }
    public static int minSubArrayLen(int target, int[] arr){
        int si=0;
        int ei=0;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        while(ei<arr.length){
            //grow
            sum+=arr[ei];
            //shrink
            while(sum>target && si<=ei){
                sum-=arr[si];
                si++;
            }
            //ansupdate
            if(sum==target) {
                ans = Math.min(ans, ei - si + 1);
            }
            ei++;
        }
        if(sum<target){
            return 0;
        }
        return ans;
    }
}
