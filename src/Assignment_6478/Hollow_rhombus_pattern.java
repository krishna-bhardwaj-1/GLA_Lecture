package Assignment_6478;

import java.util.Scanner;

public class Hollow_rhombus_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int star=n;
        int row=1;
        while(row<=n){
            int i=1,j=1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            while(j<=star){
                if(row==1||row==n||j==1||j==n) System.out.print("*");
                else System.out.print(" ");
                j++;
            }
            space--;
            System.out.println();
            row++;
        }
    }
}
