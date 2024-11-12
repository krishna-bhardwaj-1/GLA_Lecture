package Assignment_2darray_binarysearch;

import java.util.Scanner;

public class Diagonal_Traversal {
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
        printDiagonalOrder(arr,n,m);
    }
    public static void printDiagonalOrder(int[][] matrix, int M, int N) {
        for (int d = 0; d < M + N - 1; d++) {
            if (d % 2 == 0) {
                int row = d < M ? d : M - 1;
                int col = d < M ? 0 : d - M + 1;
                while (row >= 0 && col < N) {
                    System.out.print(matrix[row][col] + " ");
                    row--;
                    col++;
                }
            } else {
                int row = d < N ? 0 : d - N + 1;
                int col = d < N ? d : N - 1;
                while (row < M && col >= 0) {
                    System.out.print(matrix[row][col] + " ");
                    row++;
                    col--;
                }
            }
        }
    }

}
