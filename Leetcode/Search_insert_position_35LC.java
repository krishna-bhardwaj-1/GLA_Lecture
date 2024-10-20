package Leetcode;

public class Search_insert_position_35LC {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int tar=7;
        System.out.println(position(nums,tar));
    }
    public static int position(int[] nums,int tar){
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if (nums[mid] == tar) {
                return mid;
            }
            else if (nums[mid] > tar) {
                hi=mid-1;
            }
            else {
                lo=mid+1;
            }
        }
        return lo;
    }
}
