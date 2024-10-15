package Assignment_1;

import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(ar[i]);
        }
    }
}
