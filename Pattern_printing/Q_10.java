package Pattern_printing;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        /*
         * * * * * * * * *
           * * * * * * *
             * * * * *
               * * *
                 *
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++) {
            for (j = 1; j < i; j++)
                System.out.print("  ");
            for(k=i;k<=(2*n-i);k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}