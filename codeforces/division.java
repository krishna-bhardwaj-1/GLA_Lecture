package codeforces;

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0){
            int num=sc.nextInt();
            if(num<=1399){
                System.out.println("Division 4");
            }
            else if(1400<=num && num<=1599){
                System.out.println("Division 3");
            }
            else if(1600<=num && num<=1899){
                System.out.println("Division 2");
            }
            else {
                System.out.println("Division 1");
            }
        }
    }
}
