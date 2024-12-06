package practice_endsem_3rd;

import java.util.Scanner;

public class insert_particular_position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=sc.nextInt();
        int number=sc.nextInt();
        for(int i=arr.length-2;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=number;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
