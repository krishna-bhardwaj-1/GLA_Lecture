package Leetcode;

import java.util.Arrays;

public class Count_the_Number_of_Fair_Pairs {
    public static void main(String[] args) {
        int[] nums = {0,1,7,4,4,5};
        int lower=3;
        int upper=6;
        countFairPairs(nums,lower,upper);
    }
    public static void countFairPairs(int[] arr, int lower, int upper) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[i] + arr[mid] >= lower) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            int lowBound = left;
            left = i + 1;
            right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[i] + arr[mid] <= upper) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            int upBound = right;
            count += Math.max(0, upBound - lowBound + 1);
        }
        System.out.println(count);
    }
}
