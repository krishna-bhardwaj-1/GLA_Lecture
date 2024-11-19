package Leetcode;

import java.util.Arrays;

public class Height_checker {
    public static void main(String[] args) {
        int[] heights={1,1,4,2,1,3};
        heightChecker(heights);
    }
    public static void heightChecker(int[] heights) {
        int[] arr= Arrays.copyOf(heights,heights.length);
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=arr[i]){
                c++;
            }
            
        }
        System.out.println(c);
    }
}
