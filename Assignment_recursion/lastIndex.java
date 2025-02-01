package Assignment_recursion;

import java.util.Scanner;

public class lastIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int item=sc.nextInt();
        System.out.print(sol(arr,item,n-1));
    }
    private static int sol(int[] arr,int item,int cr){
        if(cr<0){
            return -1;
        }
        if(arr[cr]==item){
            return cr;
        }
        return sol(arr,item,cr-1);
    }
}
