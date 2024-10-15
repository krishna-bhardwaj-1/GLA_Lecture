package Assignment_6685;

import java.util.Scanner;

public class Running_sum_of_the_array {
    public static void main(String[] args) {
        Scanner scb=new Scanner(System.in);
        int m=scb.nextInt();
        int[] arry=new int[m];
        int sum=0;
        for(int g=0;g<m;g++){
            arry[g]=scb.nextInt();
            sum+=arry[g];
            System.out.print(sum+" ");
        }
    }
}
