package Pattern_printing;

import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args) {
        /*
                 *
               * *
             * * *
           * * * *
         * * * * *
           * * * *
             * * *
               * *
                 *
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for(i=1;i<=2*n;i++){
            if(i<=n) {
                for (j = i; j < n; j++) {
                    System.out.print("  ");
                }
                for (k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(j=n;j<i;j++){
                    System.out.print("  ");
                }
                for(k=i;k<2*n;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
