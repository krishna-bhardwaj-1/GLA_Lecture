package Leetcode;

import java.util.Arrays;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] arrne=Print(matrix);
        System.out.println(Arrays.toString(arrne));
    }
    public static int[] Print(int[][] arr){
        int minc=0;
        int minr=0;
        int maxc=arr[0].length-1;
        int maxr=arr.length-1;
        int te=arr.length*arr[0].length;
        int c=0;
        int[] result=new int[te];
        while(c<te)
        {
            for (int i = minc; i <= maxc && c<te; i++) {
                result[c]=arr[minr][i];
                c++;
            }
            minr++;
            for (int i = minr; i <= maxr && c<te; i++) {
                result[c]=arr[i][maxc];
                c++;
            }
            maxc--;
            for (int i = maxc; i >= minc && c<te; i--) {
                result[c]=arr[maxr][i];
                c++;
            }
            maxr--;
            for (int i = maxr; i >= minr && c<te; i--) {
                result[c]=arr[i][minc];
                c++;
            }
            minc++;
        }
        return result;
    }
}
