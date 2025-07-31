package codeforces;

import java.util.Scanner;

public class petyastring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        s=s.toLowerCase();
        t=t.toLowerCase();
        int i=0;
        for(;i<s.length();i++){
            if(s.charAt(i)>t.charAt(i)){
                System.out.print(1);
                break;
            }
            else if(s.charAt(i)<t.charAt(i)){
                System.out.print(-1);
                break;
            }
        }
        if(i==s.length()){
            System.out.print(0);
        }
    }
}
