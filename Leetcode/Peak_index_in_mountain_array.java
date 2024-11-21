package Leetcode;

public class Peak_index_in_mountain_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,8};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int lo=1;
        int hi=arr.length-2;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return hi;
    }
}
