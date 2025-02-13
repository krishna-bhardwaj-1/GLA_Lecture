package Assignment_2darray_binarysearch;

import java.util.Scanner;

public class Rotate_Image {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        transpose(arr);
        rotate(arr);
        Print(arr);
    }
    public static void Print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void rotate(int[][] arr){
        for(int col=0;col<arr[0].length;col++){
            int i=0;
            int j=arr.length-1;
            while(i<j){
                int temp=arr[i][col];
                arr[i][col]=arr[j][col];
                arr[j][col]=temp;
                i++;
                j--;
            }
        }
    }
}
