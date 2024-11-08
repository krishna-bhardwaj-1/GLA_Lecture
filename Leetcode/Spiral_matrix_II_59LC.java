package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Spiral_matrix_II_59LC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arrnew=generatematrix(n);
        for(int i=0;i<arrnew.length;i++){
            for(int j=0;j<arrnew.length;j++){
                System.out.print(arrnew[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] generatematrix(int n){
        int c=1;
        int minc=0;
        int minr=0;
        int maxc=n-1;
        int maxr=n-1;
        int[][] arr=new int[n][n];
        while(c<=n*n){
            for(int i=minc;i<=maxc;i++){
                arr[minr][i]=c;
                c++;
            }
            minr++;
            for(int i=minr;i<=maxr;i++){
                arr[i][maxc]=c;
                c++;
            }
            maxc--;
            for(int i=maxc;i>=minc;i--){
                arr[maxr][i]=c;
                c++;
            }
            maxr--;
            for(int i=maxr;i>=minr;i--){
                arr[i][minc]=c;
                c++;
            }
            minc++;
        }
        return arr;
    }
}
