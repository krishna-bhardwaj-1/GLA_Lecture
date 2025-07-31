package Assignment_recursion;

import java.util.Scanner;

public class split_array {
    static int c;
    public static void main(String[] args) {
        c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        split(arr,0,"",0,"",0);
        System.out.print(c);
    }
    private static void split(int[] arr,int idx,String ans1,int sum1,String ans2,int sum2){
        if(idx==arr.length){
            if(sum1==sum2){
                c++;
                System.out.println(ans1+"and "+ans2);
            }
            return;
        }
        split(arr,idx+1,ans1+arr[idx]+" ",sum1+arr[idx],ans2,sum2);
        split(arr,idx+1,ans1,sum1,ans2+arr[idx]+" ",sum2+arr[idx]);
    }
}
