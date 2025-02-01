package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class gameofMathletes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int c=0;
        int i=0;
        int j=arr.length-1;
        while(sum(arr)!=0){
            System.out.println(j);
            if(arr[i]+arr[j]==target){
                arr[i]=0;
                arr[j]=0;
                i++;
                j--;
                c++;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else {
                j--;
            }
        }
        System.out.println(c);
    }
    private static int sum(int[] arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
}
