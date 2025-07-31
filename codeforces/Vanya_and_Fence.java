package codeforces;

import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int c=0;
        for (int i=0;i<n;i++){
            int p=sc.nextInt();
            if(p<=x) c++;
            else c+=2;
        }
        System.out.println(c);
    }
}
