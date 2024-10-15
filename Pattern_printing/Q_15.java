package Pattern_printing;

import java.util.Scanner;

public class Q_15 {
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
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<2*n;i++){
            if(i<=n) {
                for (int j = 1; j < (2 * i - 1); j++) {
                    System.out.print("  ");
                }
                for (int k = i; k <=n; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int j=i;j<=(3*n+2)-i;j++){
                    System.out.print("  ");
                }
                for(int k=n;k<=i;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
