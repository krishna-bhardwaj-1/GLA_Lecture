package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {
        /*
         *               *
         * *           * *
         * * *       * * *
         * * * *   * * * *
         * * * * * * * * *
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int row=1;
        int space=2*n-3;
        while(row<=n){
            int i=1,j=1,k=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            if(row==n) k++;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            space-=2;
            star++;
            row++;
        }
    }
}
