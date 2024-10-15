package Assignment_array;

import java.util.Scanner;

public class square_of_sorted_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=arr1[i]*arr1[i];
        }
        for(int j=0;j<n;j++) {
            for (int i = n - 1; i > 0; i--) {
                if (arr[i] < arr[i - 1]) {
                    int c = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = c;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
