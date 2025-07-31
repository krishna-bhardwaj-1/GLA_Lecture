package Lecture_34_02Apr;

public class Generics_Demo {
    public static void main(String[] args) {
        Integer[] arr={10,20,30,40,4,60};
        Display(arr);
        String[] arr1={"ram","shyam","krishna"};
        Display(arr1);

    }
    public static <T>void Display(T[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
