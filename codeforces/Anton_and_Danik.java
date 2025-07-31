package codeforces;

import java.util.Scanner;

public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int x=0,y=0;
        for (int i=0;i<n;i++){
            if(s.charAt(i)=='A') x++;
            else y++;
        }
        if(x==y) System.out.println("Friendship");
        else if(x>y) System.out.println("Anton");
        else System.out.println("Danik");
    }
}
