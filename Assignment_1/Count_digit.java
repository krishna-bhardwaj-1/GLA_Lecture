package Assignment_1;

import java.util.Scanner;

public class Count_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int m,c=0;
        while(n>0){
            m=n%10;
            n=n/10;
            if(m==p) c++;
        }
        System.out.print(c);
    }
}
