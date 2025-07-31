package Assignment_recursion;

import java.util.Scanner;

public class subset {
    static int c;
    public static void main(String[] args) {
        c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        sol(arr,0,"",target);
        System.out.print(c);
    }
    private static void sol(int[] arr,int idx,String ans,int target){
        if(idx==arr.length){
            if(target==0){
                System.out.print(ans+" ");
            }
            return;
        }
        sol(arr,idx+1,ans+arr[idx]+" ",target-arr[idx]);
        sol(arr,idx+1,ans,target);
    }
}
