package Leetcode;

public class Search_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] arr={0,3};
        int tar=3;
        System.out.println(search_rsarray(arr,tar));
    }
    public static int search_rsarray(int[] arr,int tar){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(arr[mid]==tar) return mid;
            //left part of the array is sorted
            if(arr[lo]<=arr[mid]){
                if(arr[lo]<=tar && tar<=arr[mid]) hi=mid-1;
                else lo=mid+1;
            }
            //right part of the array is sorted
            else {
                if(arr[mid]<=tar && arr[hi]>=tar) lo=mid+1;
                else hi=mid-1;
            }
        }
        return -1;
    }
}
