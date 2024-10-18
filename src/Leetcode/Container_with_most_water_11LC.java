package Leetcode;

public class Container_with_most_water_11LC {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(Trapping(height));
    }
    //TLE
//    public static int Trapping(int[] arr){
//        int n=arr.length-1;
//        int maxwater=0;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<=n;j++){
//                int x=Math.min(arr[i],arr[j]);
//                int y=j-i;
//                int water=x*y;
//                maxwater=Math.max(maxwater,water);
//            }
//        }
//        return maxwater;
//    }
    public static int Trapping(int[] arr){
        int i=0;
        int j=arr.length-1;
        int maxwater=0;
        while(i<j){
            int y=j-i;
            int x=Math.min(arr[i],arr[j]);
            int water=x*y;
            maxwater=Math.max(maxwater,water);
            if(arr[i]<arr[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return maxwater;
    }
}
