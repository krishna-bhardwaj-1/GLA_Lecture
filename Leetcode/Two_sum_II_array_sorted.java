package Leetcode;

import java.util.Arrays;

public class Two_sum_II_array_sorted {
    public static void main(String[] args) {
        int[] arr={1,2,4,7,9};
        int target=9;
        int[] twosum=twoSum(arr,target);
        System.out.println(Arrays.toString(twosum));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]<target){
                i++;
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
            else{
                return new int[] {i+1,j+1};
            }
        }
        return new int[] {};
    }
}
