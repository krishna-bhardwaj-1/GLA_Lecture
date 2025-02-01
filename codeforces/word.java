package codeforces;

import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sm=0,cap=0;
        String s=sc.next();
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                sm++;
            }
            else {
                cap++;
            }
        }
        if(sm>=cap){
            System.out.println(s.toLowerCase());
        }
        else {
            System.out.println(s.toUpperCase());
        }
    }
}
