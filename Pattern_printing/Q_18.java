package Pattern_printing;

import java.util.Scanner;

public class Q_18 {
    public static void main(String[] args) {
        /*     *
             * * *
           * * * * *
         * * * * * * *
           * * * * *
             * * *
               *
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            if(i<=(n/2+1)) {
                for (int j = i; j <= n / 2; j++)
                    System.out.print("  ");
                for (int k = 1; k <= 2*i-1; k++)
                    System.out.print("* ");
                System.out.println();
            }
            else{
                for (int j = n/2+1; j < i; j++)
                    System.out.print("  ");
                for (int k = i; k <= 2*n-i; k++)
                    System.out.print("* ");
                System.out.println();
            }
        }
    }
}
