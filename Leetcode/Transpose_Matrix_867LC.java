package Leetcode;

public class Transpose_Matrix_867LC {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] trans=transpose(arr);
        for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[0].length;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] arr) {
        int row=arr.length;
        int col=arr[0].length;
        int[][] transpose=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=arr[i][j];
            }
        }
        return transpose;
    }
}
