package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class trippi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while (n-->0){
            String s=sc.nextLine();
            String[] arr=s.split(" ");
            StringBuilder sb=new StringBuilder();
            for (int i=0;i<arr.length;i++){
                sb.append(arr[i].charAt(0));
            }
            System.out.println(sb);
        }
    }
}
