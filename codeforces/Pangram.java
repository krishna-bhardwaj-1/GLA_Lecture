package codeforces;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int[] arr=new int[26];
        for (char ch:s.toLowerCase().toCharArray()){
            arr[ch-'a']++;
        }
        int i=0;
        for (;i<arr.length;i++){
            if(arr[i]==0){
                System.out.println("NO");
                break;
            }
        }
        if(i==arr.length) System.out.println("YES");
    }
}
