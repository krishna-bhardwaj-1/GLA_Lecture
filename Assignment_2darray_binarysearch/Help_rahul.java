package Assignment_2darray_binarysearch;

import java.util.Scanner;

public class Help_rahul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int item=sc.nextInt();
        System.out.println(binary(arr,item));
    }
    public static int binary(int[] arr,int item){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==item){
                return mid;
            }
            else if(arr[lo]<=arr[mid]){
                if(arr[lo]<=item&&arr[mid]>=item) hi=mid-1;
                else lo=mid+1;
            }
            else {
                if(arr[mid]<=item&&arr[hi]>=item) lo=mid+1;
                else hi=mid-1;
            }
        }
        return -1;
    }
}
