package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Plus_One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        for(int i=0;i<3;i++)
            arr[i]=sc.nextInt();
        plus(arr);
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void plus(int[] arr){
        int n=arr.length-1;
        arr[n]+=1;
        if(arr[n]>9){
            arr=new int[arr.length+1];
   //         System.out.println(arr[arr.length-1]=arr[arr.length-2]%10);
            System.out.println(arr[arr.length-3]/10);
        }
    }
}
