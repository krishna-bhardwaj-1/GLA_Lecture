package codeforces;

import java.util.Scanner;

public class magnets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int grp=1;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]) grp++;
        }
        System.out.println(grp);
    }
}
