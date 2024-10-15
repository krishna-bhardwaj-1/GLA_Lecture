package Pattern_printing;

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        /*
                 *
               * *
             * * *
           * * * *
         * * * * *
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++){
            for(j=i;j<n;j++){
                System.out.print("  ");
            }
            for(k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
