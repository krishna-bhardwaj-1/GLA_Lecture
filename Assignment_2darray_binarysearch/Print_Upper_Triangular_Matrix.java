package Assignment_2darray_binarysearch;

import java.util.Scanner;

public class Print_Upper_Triangular_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Print(arr);
    }
    public static void Print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i>j) System.out.print(0+" ");
                else System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
