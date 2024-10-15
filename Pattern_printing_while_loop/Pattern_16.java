package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        /*
                 * * * * *
               * * * *
             * * *
           * *
         *
           * *
             * * *
               * * * *
                 * * * * *
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int star=n;
        while(row<=2*n-1){
            int i=1,j=1;
            //spaces
            while(i<=space){
                System.out.print("   ");
                i++;
            }
            //stars
            while(j<=star){
                System.out.print("*  ");
                j++;
            }
            //mirror
            if(row<n)space--;
            else space++;
            if(row<n) star--;
            else star++;
            //preparation
            System.out.println();
            row++;
        }
    }
}
