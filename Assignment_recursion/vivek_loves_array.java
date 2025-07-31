package Assignment_recursion;

import java.util.Scanner;

public class vivek_loves_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(sol(arr,0,n-1));
        }
    }
    private static int sol(int[] arr,int si,int ei){
        if(si>=ei){
            return 0;
        }
        for(int mid=si;mid<ei;mid++){
            int sum1=0,sum2=0;
            for (int i=si;i<=mid;i++){
                sum1+=arr[i];
            }
            for (int i=mid+1;i<=ei;i++){
                sum2+=arr[i];
            }
            if(sum1==sum2){
                int left=sol(arr,si,mid);
                int right=sol(arr,mid+1,ei);
                return Math.max(left,right)+1;
            }
        }
        return 0;
    }
}
