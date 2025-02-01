package codeforces;

import java.util.Scanner;

public class dislikes_of_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0){
            int i=1;
            int place=sc.nextInt();
            while (place>0){
                if(isthree(i)){
                    place--;
                }
                i++;
            }
            System.out.println(i-1);
        }
    }
    private static boolean isthree(int n){
        if(n%3==0 || n%10==3){
            return false;
        }
        return true;
    }
}
