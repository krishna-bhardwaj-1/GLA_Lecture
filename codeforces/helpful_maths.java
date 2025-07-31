package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class helpful_maths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split("\\+");
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            if(i!=arr.length-1)sb.append("+");
        }
        System.out.println(sb);
    }
}
