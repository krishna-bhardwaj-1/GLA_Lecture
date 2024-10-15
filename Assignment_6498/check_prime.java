package Assignment_6498;

import java.util.Scanner;

public class check_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        for(int i=2;i<=a/2;i++){
            if(a%i==0) c++;
        }
        if(c==0) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
