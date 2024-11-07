package Assignment_2darray_binarysearch;

import java.util.Scanner;

public class Matrix_Search {
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
        int item=sc.nextInt();
        System.out.println(search(arr,item));
        }
        public static int search(int[][] arr,int item){
            int row=0;
            int col=arr[0].length-1;
            while(row<arr.length&&col>=0){
                if(arr[row][col]==item){
                    return 1;
                }
                else if(arr[row][col]>item){
                    col--;
                }
                else {
                    row++;
                }
            }
            return 0;
    }
}
