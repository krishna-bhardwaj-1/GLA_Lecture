package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_22 {
    public static void main(String[] args) {
        /*
         * * * * * * * * *
         * * * *   * * * *
         * * *       * * *
         * *           * *
         *               *
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        int space=0;
        while(row<=n){
            int i=1,j=1,k=1;
            //stars
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //space
            while(j<space){
                System.out.print("  ");
                j++;
            }
            //star
            if(row==1) k++;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            star--;
            space+=2;
            row++;
        }
    }
}
