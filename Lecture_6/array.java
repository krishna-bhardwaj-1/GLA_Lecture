package Lecture_6;

public class array {
    //array is a class which is non primitive that why for this memory is given in heap.
    //5 bucket = 20 byte in a heap memory.(continuous memory allocation) in java all class's memory are stored in heap.
    //variables are in stack and content(memory) is in heap.
    public static void main(String[] args) {
        int[] arr=new int[5];
        System.out.println(arr);
        int[] other=arr;
//        System.out.println(other.length);

        //set manually
        arr[0]=5;
        arr[1]=6;
        arr[2]=9;
        arr[3]=2;

        //print manually
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}
