package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        /*
         * * * * *
         *       *
         *       *
         *       *
         * * * * *
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=5;
        while(row<=n){
            //star
            int i=1;
            while(i<=star){
                if(row==1||row==n||i==1||i==n)
                System.out.print("* ");
                else System.out.print("  ");
                i++;
            }
            row++;
            System.out.println();
        }
    }
}
