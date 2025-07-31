package Lecture_34_02Apr;

public class Car_client {
    public static void main(String[] args) {
        Cars[] arr=new Cars[5];
        arr[0]=new Cars(200,10,"white");
        arr[1]=new Cars(1000,20,"Black");
        arr[2]=new Cars(354,3,"Yellow");
        arr[3]=new Cars(34,89,"Grey");
        arr[4]=new Cars(8907,6,"Red");
        display(arr);
    }
    public static void display(Cars[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
