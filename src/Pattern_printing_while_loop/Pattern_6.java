package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_6 {
public static void main(String[] args) {
    /*
     * * * * *
         * * * *
             * * *
                 * *
                     *
     */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=n;
        int row=1;
        int space=0;
        while(row<=n){
            int i=1,j=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            star--;
            space+=2;
            row++;
        }
    }
}
