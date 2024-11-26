package Leetcode;

import java.util.Scanner;

public class Nim_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(win(n));
    }
    public static boolean win(int n){
        if(n%4==0){
            return false;
        }
        return true;
    }
}
