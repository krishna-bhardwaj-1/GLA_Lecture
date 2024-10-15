package Assignment_1;

import java.util.Scanner;

public class Fahrenhite_to_celcius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int minm=sc.nextInt();
        int maxm=sc.nextInt();
        int stepi=sc.nextInt();
        for(int i=minm;i<=maxm;i+=stepi){
            System.out.println(i+" "+(i-32)*5/9);
        }
    }
}
