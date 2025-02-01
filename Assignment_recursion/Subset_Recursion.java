package Assignment_recursion;

import java.util.Scanner;
public class Subset_Recursion {
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
        sol(arr,target,"");
        System.out.print("\n"+c);
    }
    private static void sol(int[] arr,int target,String ans){
        if(target==0){
            c++;
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<arr.length;i++){
            int number=arr[i];
            int[] bachikuchiarr=new int[arr.length-1];
            int c=0;
            for(int idx=i+1;idx<arr.length;idx++){
                bachikuchiarr[c]=arr[idx];
                c++;
            }
            sol(bachikuchiarr,target-arr[i],ans+number+" ");
        }
    }
}
