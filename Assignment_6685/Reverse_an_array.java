package Assignment_6685;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_an_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nar=new int[n];
        for(int g=0;g<n;g++)
            nar[g]=sc.nextInt();
        Reversingaray(nar);
        for(int g=0;g<n;g++)
            System.out.print(nar[g]+" ");
    }
    public static void Reversingaray(int[] nar){
        int a=0,b=nar.length-1;
        while(a<b){
            int temp=nar[a];
            nar[a]=nar[b];
            nar[b]=temp;
            a++;
            b--;
        }
    }
}
