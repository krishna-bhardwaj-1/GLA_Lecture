package Pattern_printing;

import java.util.Scanner;

public class Q_6 {
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
        int i,j,k;
        for(i=1;i<=n;i++) {
            for (j = 1; j < (2*i-1); j++)
                System.out.print("  ");
            for(k=i;k<=n;k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
