package codeforces;

import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] arr=new int[26];
        for (char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        int c=0;
        for (int i:arr){
            if(i!=0) c++;
        }
        if(c%2!=0) System.out.println("IGNORE HIM!");
        else System.out.println("CHAT WITH HER!");
    }
}
