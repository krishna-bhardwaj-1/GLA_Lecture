package Assignment_2darray_binarysearch;

import java.util.Scanner;

public class column_with_matrix_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        maxsumcolumn(arr);
    }
    public static void maxsumcolumn(int[][] arr){
        long maxsum=0;
        int co=1;
        for(int col=0;col<arr[0].length;col++){
            long sum=0;
            for(int row=0;row<arr.length;row++){
                sum+=arr[row][col];
            }
            if(maxsum<=sum) {
                maxsum = sum;
                co=col+1;
            }
        }
        System.out.println(co);
        System.out.println(maxsum);
    }
}
