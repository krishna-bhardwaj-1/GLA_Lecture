package Assignment_6478;

import java.util.Scanner;

public class pattern_magic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        int space=0;
        while(row<=2*n-1){
            int i=1,j=1,k=1;
            while(i<=star){
                System.out.print("*");
                i++;
            }
            while(j<space){
                System.out.print(" ");
                j++;
            }
            if(row==1||row==2*n-1) k=2;
            while(k<=star){
                System.out.print("*");
                k++;
            }
            if(row<n){ star--; space+=2;}
            else {star++; space-=2;}
            System.out.println();
            row++;
        }
    }
}
