package Assignment_6498;

import java.util.Scanner;

public class shopping_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n > 0) {
            int M=sc.nextInt();
            int N=sc.nextInt();
            if(M>N) System.out.println("Aayush");
            else System.out.println("Harshit");
            n--;
        }
    }
}
