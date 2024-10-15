package Lecture_3;

import java.util.Scanner;

public class fibonacci_number {
    public static void main(String[] args) {
        //fibonacci number: 0 1 1 2 3 5 8 13 21 34 55 89 144..........
        //index:            0 1 2 3 4 5 6 7  8  9  10 11  12  ..........
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }

    }
}
