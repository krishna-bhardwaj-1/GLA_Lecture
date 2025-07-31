package codeforces;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int x=0;x<n;x++){
            arr[x]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            int idx=0;
            while (idx<arr.length){
                if(arr[idx]==i){
                    System.out.print((idx+1)+" ");
                    break;
                }
                idx++;
            }
        }
    }
}
