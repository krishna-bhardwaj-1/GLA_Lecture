package Lecture_4;

import java.util.Scanner;

public class Bin_to_dec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int mul=1;               // if one of the base is 10: then one is source and other one is destination.
        while(n>0){
            int rem=n%10;        //destination
            sum+=rem*mul;
            n/=10;               // destination
            mul*=2;              // source
        }
        System.out.println(sum);
    }
}
