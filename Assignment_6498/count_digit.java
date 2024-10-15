package Assignment_6498;

import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextByte();
        int i=0;
        while(n>0){
            int c=n%10;
            if(c==a) i++;
            n/=10;
        }
        System.out.println(i);
    }
}
