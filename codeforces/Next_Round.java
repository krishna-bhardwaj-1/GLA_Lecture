package codeforces;

import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int score=0;
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(i==k-1) score=arr[i];
        }
        int c=0;
        for (int i:arr){
            if(i>=score && i>0) c++;
        }
        System.out.println(c);
    }
}
