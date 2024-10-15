package Lecture_5;

import java.util.Scanner;

public class inverse_of_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int pos=1;
        while(n>0){
            int rem=n%10;
            sum+=(int)(pos*Math.pow(10,rem-1));
            pos++;
            n/=10;
        }
        System.out.println(sum);
    }
}
