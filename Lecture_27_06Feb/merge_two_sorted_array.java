package Lecture_27_06Feb;

import java.util.Arrays;
public class merge_two_sorted_array {
    public static void main(String[] args) {
        int[] arr1={2,3,5,7,8};
        int[] arr2={1,3,5,8,9,11,13};
        System.out.println(Arrays.toString(Merge_two_Sorted_Array(arr1,arr2)));
    }
    public static int[] Merge_two_Sorted_Array(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int[] ans=new int[n+m];
        int i=0,j=0,k=0;
        while (i<n && j<n){
            if(arr1[i] < arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }
            else {
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }

        while (i<n){
            ans[k]=arr1[i];
            k++;
            i++;
        }

        while (j<m){
            ans[k]=arr2[j];
            k++;
            j++;
        }
        return ans;
    }
}
