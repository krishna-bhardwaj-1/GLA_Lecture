package Assignment_6685;

import java.util.Scanner;

public class Array_linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        System.out.println(Linearsearch(arr,tar));
    }
    public static int Linearsearch(int[] arr,int tar){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar) return i;
        }
        return -1;
    }
}
