package Lecture_7;

public class Array_swap_1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 7, 9, 8};
        System.out.println(arr[0] + " " + arr[1]);
        Swap(arr[0], arr[1]);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void Swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }
}
