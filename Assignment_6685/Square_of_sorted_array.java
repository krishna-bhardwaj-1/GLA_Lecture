package Assignment_6685;

import java.util.Scanner;

public class Square_of_sorted_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nar=new int[n];
        for(int g=0;g<n;g++)
            nar[g]=sc.nextInt();
        Sqaured(nar);
        Sort(nar);
        for(int g=0;g<n;g++)
            System.out.print(nar[g]+" ");
    }
    public static void Sqaured(int[] nar){
        for(int j=0;j<nar.length;j++){
            nar[j]=nar[j]*nar[j];
        }
    }
    public static void Sort(int[] nar){
        for(int i=1;i<nar.length;i++){
            for(int j=0;j<nar.length-i;j++){
                if(nar[j+1]<nar[j]){
                    int temp=nar[j];
                    nar[j]=nar[j+1];
                    nar[j+1]=temp;
                }
            }
        }
    }
}
