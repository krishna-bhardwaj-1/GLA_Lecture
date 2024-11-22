package Leetcode;

public class single_number {
    public static void main(String[] args) {
        int[] arr={4,1,2,2,1};
        singleNumber(arr);
    }
    public static int singleNumber(int[] nums) {
        int[] frequncy =new int[10];
        for(int i=0;i<nums.length;i++){
            frequncy[nums[i]]++;
        }
        for(int i=0;i<frequncy.length;i++){
            if(frequncy[i]==1){
                System.out.println(i);
            }
        }
        return 0;
    }
}
