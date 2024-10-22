package Leetcode;

public class Maximum_sum_Circular_subarray_918LC {
    public static void main(String[] args) {
        int[] arr={1,-2,3,-2};
        System.out.println(citcular_sum(arr));
    }
    public static int citcular_sum(int[] arr){
        int ans=Integer.MAX_VALUE;
        int sum=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            c+=arr[i];
            sum+=arr[i];
            ans=Math.min(ans,sum);
            if(sum>0){
                sum=0;
            }
        }
        return c-ans;
    }
}
