package Assignment_2darray_binarysearch;

import java.util.Scanner;

public class Rowwise_sort_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        row_sort(arr);
        Print(arr);
    }
    public static void row_sort(int[][] arr){
        for(int row=0;row<arr.length;row++){
            for(int col=1;col<arr[0].length;col++){
                for(int j=0;j<arr[0].length-col;j++) {
                    if (arr[row][j] > arr[row][j+1]) {
                        int temp = arr[row][j];
                        arr[row][j] = arr[row][j + 1];
                        arr[row][j + 1] = temp;
                    }
                }
            }
        }
    }
    public static void Print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
