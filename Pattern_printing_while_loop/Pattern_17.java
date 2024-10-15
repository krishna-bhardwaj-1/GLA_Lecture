package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        /*
         * * *  * * *
         * *      * *
         *          *

         *          *
         * *      * *
         * * *  * * *
         */
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n/2;
        int space=1;
        while(row<=n){
            //star
            int i=1,j=1,k=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //space
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            //star
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            if(row<n/2+1) star--;
            else star++;
            if(row<(n/2+1)) space+=2;
            else space-=2;
            System.out.println();
            row++;
        }
    }
}
