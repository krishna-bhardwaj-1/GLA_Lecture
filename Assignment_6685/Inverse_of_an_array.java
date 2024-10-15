package Assignment_6685;

import java.util.Scanner;

public class Inverse_of_an_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Inverse(arr,arr2);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr2[i]+" ");
    }
    public static void Inverse(int[] arr,int[] arr2){
        for(int i=0;i<arr.length;i++){
            int c=arr[i];
            arr2[c]=i;
        }
    }
}
