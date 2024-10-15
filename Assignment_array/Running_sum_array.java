package Assignment_array;

import java.util.Scanner;

public class Running_sum_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int c=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            c+=arr[i];
            System.out.print(c+" ");
        }
    }
}
