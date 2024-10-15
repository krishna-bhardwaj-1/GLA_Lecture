package Assignment_6685;

import java.util.Scanner;

public class Alex_goes_shopping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int p=sc.nextInt();
        while(p>0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(correct(x,y,arr));
            p--;
        }
    }
    public static boolean correct(int x, int y, int[] arr){
        int c=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x&&sum<x) {
                sum+=arr[i];
                c++;
            }
        }
        if(c==y) return true;
        else return false;
    }
}
