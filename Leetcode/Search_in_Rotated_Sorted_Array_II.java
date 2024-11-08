package Leetcode;

public class Search_in_Rotated_Sorted_Array_II {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1};
        int target=0;
        System.out.println(search(nums,target));
    }
    public static boolean search(int[] nums,int target){
        int lo=0;
        int hi= nums.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==target) return true;
            //if it contains duplicate then skip
            if(nums[lo]==nums[mid]&&nums[mid]==nums[hi]){
                lo++;
                hi--;
            }
            else if (nums[lo]<=nums[mid]) {
                if(nums[lo]<=target&&nums[mid]>=target) hi=mid-1;
                else lo=mid+1;
            }
            else{
                if(nums[mid]<=target && nums[hi]>=target) lo=mid+1;
                else hi=mid-1;
            }
        }
        return false;
    }
}
