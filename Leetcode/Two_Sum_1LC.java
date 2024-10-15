package Leetcode;

public class Two_Sum_1LC {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int tar=9;
        int[] a=sumtarg(arr,tar);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static int[] sumtarg(int[] arr,int tar){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==tar){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
