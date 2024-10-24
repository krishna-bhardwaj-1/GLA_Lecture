package Leetcode;

public class Element_Appearing_More_Than_25 {
    public static void main(String[] args) {
        int arr[]={15,15,21,21,32,32,33,33,33,34,35};
        System.out.println(max_count(arr));
    }
    public static int max_count(int[] arr){
        int e=arr[0];
        int cnt=arr.length/4;
        int v=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==e){
                v++;
                if(v>cnt) return e;
            }
            else{
                e=arr[i];
                v=1;
            }
        }
        return e;
    }
}
