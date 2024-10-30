package Leetcode;

public class Two_Sum_1LC {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int tar=9;
        int[] a=sumtarg(arr,tar);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static int[] sumtarg(int[] nums,int target){
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j - i] == target) {
                    return new int[] { j, j - i };
                }
            }
        }
        return null;
        //if the array is sorted we can easily apply the binary search two pointer approach.
    }
}
