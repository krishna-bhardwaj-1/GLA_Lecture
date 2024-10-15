package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        /*
                     *
                  *  *
               *  *  *
            *  *  *  *
         *  *  *  *  *
            *  *  *  *
               *  *  *
                  *  *
                     *
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int row=1;
        int space=n-1;
        while(row<=2*n-1){
            int i=1,j=1;
            //space
            while(i<=space){
                System.out.print("   ");
                i++;
            }
            //star
            while(j<=star){
                System.out.print("*  ");
                j++;
            }
            //mirror for stars
            if(row<n) star++;
            else star--;
            //mirror for spaces
            if(row<n) space--;
            else space++;
            //preparation
            System.out.println();
            row++;
        }
    }
}
