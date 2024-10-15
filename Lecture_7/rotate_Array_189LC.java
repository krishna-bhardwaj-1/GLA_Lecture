package Lecture_7;

public class rotate_Array_189LC {
    public static void main(String[] args) {
//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
//        it is a periodic function that's why cut the length by % if it exceed th length.
        int[] arr={2,1,3,4,5};
        int k=3;
        Rotate(arr,k);
    }
    public static void Rotate(int [] arr,int k){
        int n=arr.length;
        k=k%n;
        while(k>0){
            int item=arr[n-1];
            for(int i=n-1;i>=0;i--){
                arr[i+1]=arr[i];
            }
            arr[0]=item;
            k--;
        }
    }
}
