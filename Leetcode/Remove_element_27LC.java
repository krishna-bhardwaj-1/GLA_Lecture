package Leetcode;

public class Remove_element_27LC {
    public static void main(String[] args) {
        int[] arr={3,2,2,3};
        System.out.println(Remove(arr,3));

    }
    public static int Remove(int[] arr,int val){
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=val){
                arr[c]=arr[i];
                c++;
            }
        }
        return c;
    }
}
