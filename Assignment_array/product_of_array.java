package Assignment_array;

import java.util.Scanner;

public class product_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        Long c=1L;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            c*=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(c/arr[i]+" ");
        }
    }
}
