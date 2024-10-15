package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args){
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int row=1;
        while(row<=2*n-1){
            int i=1;
            //star
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //mirror
            if(row<n) star++;
            else star--;
            //preparation
            System.out.println();
            row++;
        }
    }
}
