package Lecture_13;

public class Spiral_clock {
    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        Print(arr);
    }
    public static void Print(int[][] arr){
        int minc=0;
        int minr=0;
        int maxc=arr[0].length-1;
        int maxr=arr.length-1;
        int te=arr.length*arr[0].length;
        int c=0;
        while(c<te)
        {
            for (int i = minc; i <= maxc; i++) {
                System.out.print(arr[minr][i] + " ");
                c++;
            }
            minr++;
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + " ");
                c++;
            }
            maxc--;
            for (int i = maxc; i >= minc; i--) {
                System.out.print(arr[maxr][i] + " ");
                c++;
            }
            maxr--;
            for (int i = maxr; i >= minr; i--) {
                System.out.print(arr[i][minc] + " ");
                c++;
            }
            minc++;
        }
    }
}
