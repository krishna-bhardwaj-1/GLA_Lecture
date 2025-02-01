package Assignment_recursion;

import java.util.Scanner;

public class splitarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sol(arr,0,n);
    }
    private static void sol(int[] arr,int cr,int n){
//        if(isequal(arr,cr))
        for(int i=0;i<n;i++){
            sol(arr,cr+1,n);
        }
    }
}
