package Lecture_7;

public class reverse_range {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 8, 6, 9, 11, 15, 17, 18, 16, 23, 27};
        //reverse only index: 3 to 8
        Reverse(arr,3,8);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
