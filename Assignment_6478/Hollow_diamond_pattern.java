package Assignment_6478;

import java.util.Scanner;

public class Hollow_diamond_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=n/2+1;
        int space=0;
        int row=1;
        while (row<=n){
            int i=1,j=1,k=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            while(j<space){
                System.out.print("  ");
                j++;
            }
            if(row==1||row==n) k=2;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            if(row<=n/2) {star--; space+=2;}
            else {star++; space-=2;}
            System.out.println();
            row++;
        }
    }
}
