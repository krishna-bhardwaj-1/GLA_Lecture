package Assignment_2darray_binarysearch;

import java.util.Scanner;

public class Mummy_motivational_sppech {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(uppertriangular(arr));
    }
    public static boolean uppertriangular(int[][] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i][j]!=0) return false;
            }
        }
        return true;
    }
}
