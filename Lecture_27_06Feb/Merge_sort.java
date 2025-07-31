package Lecture_27_06Feb;

import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr={5,7,3,4,2};
        System.out.println(Arrays.toString(Sort(arr,0,arr.length-1)));
    }
    private static int[] Sort(int[] arr,int si,int ei){
        if(si==ei){
            int[] bs=new int[1];
            bs[0]=arr[si];
            return bs;
        }
        int mid=(si+ei)/2;
        int[] a=Sort(arr,si,mid);
        int[] b=Sort(arr,mid+1,ei);
        return merge_two_sorted_array(a,b);
    }
    private static int[] merge_two_sorted_array(int[] a,int[] b){
        int n=a.length;
        int m=b.length;
        int[] ans=new int[n+m];
        int i=0,j=0,k=0;
        while (i<n && j<m){
            if(a[i]<b[j]){
                ans[k]=a[i];
                k++;
                i++;
            }
            else {
                ans[k]=b[j];
                k++;
                j++;
            }
        }
        while (i<n){
            ans[k]=a[i];
            k++;
            i++;
        }

        while (j<m){
            ans[k]=b[j];
            k++;
            j++;
        }
        return ans;
    }
}
