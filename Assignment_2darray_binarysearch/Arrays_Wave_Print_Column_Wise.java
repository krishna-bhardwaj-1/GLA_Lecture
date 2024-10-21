package Assignment_2darray_binarysearch;
import java.util.Scanner;
public class Arrays_Wave_Print_Column_Wise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                arr[row][col]=sc.nextInt();
            }
        }
        Print(arr,m,n);
    }
    public static void Print(int[][] arr, int m, int n){
        for(int col=0; col<n;col++){
            if(col%2==0){
                for(int row=0;row<m;row++){
                    System.out.print(arr[row][col]+", ");
                }
            }
            else {
                for(int row=m-1;row>=0;row--){
                    System.out.print(arr[row][col]+", ");
                }
            }
        }
        System.out.print("END");
    }
}
