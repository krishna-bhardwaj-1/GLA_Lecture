package Leetcode;

public class Remove_duplicate_from_a_sorted_array_26LC {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4,5,6,7,7,7,7,7};
        System.out.println(unique_elements(arr));
    }
    public static int unique_elements(int[] arr){
        if(arr.length==0) return 0;
        if(arr.length==1) return 1;
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
