package codeforces;

import java.util.Scanner;

public class George_and_accomodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int room=0;
        while (n-->0){
            int live=sc.nextInt();
            int capacity=sc.nextInt();
            if((capacity-live)>=2) room++;
        }
        System.out.println(room);
    }
}
