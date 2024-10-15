package Leetcode;

import java.util.Arrays;

public class Contains_duplicate_217LC {
    public static void main(String[] args) {
        int[] a={1,1,1,3,3,4,3,2,4,2};
        System.out.println(haveduplictae(a));
    }
    public static boolean haveduplictae(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]) return true;
        }
        return false;
    }
}
