package Lecture_9;

public class Insertion_sort {
    public static void main(String[] args) {
//        int[] arr={1,2,7,8,9,11,4};
        int[] arr={1,2,9,7,8,11,4};
//        System.out.println(InsertLastElement(arr,arr.length-1));
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            InsertLastElement(arr,i);
        }
    }
    public static void InsertLastElement(int[] arr,int i){
        int item=arr[i];
        int j=i-1;
        while(j>=0&&arr[j]>item){
            arr[j+1]=arr[j];
            arr[j]=item;
            j--;
        }
//        return j+1;
    }
}