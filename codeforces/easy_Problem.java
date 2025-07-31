package codeforces;

import java.util.Scanner;

public class easy_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int n=sc.nextInt();
        while (n-->0){
            int check=sc.nextInt();
            if (check==1) c++;
        }
        if(c>=1) System.out.println("HARD");
        else System.out.println("EASY");
    }
}
