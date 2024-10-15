package Assignment_1;

import java.util.Scanner;

public class Hollow_rhombus_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int star=n;
        while(row<=n){
            int i=1,j=1;
            //space
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            while(j<=star) {
                if(row==1||row==n||j==1||j==n) System.out.print("* ");
                else System.out.print("  ");
                j++;
            }
            //preparation
            space--;
            System.out.println();
            row++;
        }
    }
}
