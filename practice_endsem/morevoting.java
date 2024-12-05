package practice_endsem;

import java.util.Arrays;

public class morevoting {
    public static void main(String[] args) {
        int[] nums =  {0,1,0,2,1,0,1,3,2,1,2,1};
        rotate(nums);
    }
    public static void rotate(int[] arr){
        int n= arr.length;
        int[] left=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        int[] right=new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+Math.min(left[i],right[i])-arr[i];
        }
        System.out.println(sum);
    }
//    public static void rot(int[] arr,int i,int j){
//        while (i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//    }
}
