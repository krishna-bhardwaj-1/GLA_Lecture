package Leetcode;

public class Missing_number_268LC {
    public static void main(String[] args) {
        int[] nums={1,3,4,0};
        System.out.println(missing(nums));
    }
    public static int missing(int[] nums){
        int actualsum=((nums.length)*(nums.length+1))/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return actualsum-sum;
    }
}
