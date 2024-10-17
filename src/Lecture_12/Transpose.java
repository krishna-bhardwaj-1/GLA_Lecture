package Lecture_12;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr={{1,4,7,11},{2,5,8,12},{3,6,9,16},{6,14,15,28}};
        trans(arr);
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
    public static void trans(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}
