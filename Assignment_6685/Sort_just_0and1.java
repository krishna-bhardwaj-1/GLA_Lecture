package Assignment_6685;

import java.util.Scanner;

public class Sort_just_0and1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int one=0;
        int zero=0;
        int[] nar=new int[n];
        for(int g=0;g<n;g++) {
            nar[g] = sc.nextInt();
            if(nar[g]==1) one++;
            else zero++;
        }
        for(int g=0;g<zero;g++)
            System.out.print("0 ");
        for(int g=0;g<one;g++){
            System.out.print("1 ");
        }
    }
}
