package Assignment_recursion;

import java.util.Scanner;

public class all_indices_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        printindex(arr,0,n,target);
    }
    private static void printindex(int[] arr,int curr,int n,int target){
        if(curr==n){
            return;
        }
        if(arr[curr]==target){
            System.out.print(curr+" ");
        }
        printindex(arr,curr+1,n,target);
    }
}
