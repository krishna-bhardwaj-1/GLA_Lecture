package Pattern_printing;

import java.util.Scanner;

public class Q_16 {
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
                for (int j = n; j > i; j--) {
                    System.out.print("   ");
                }
                for (int k = i; k <= n; k++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
            else{
                for(int j=n;j<i;j++){
                    System.out.print("   ");
                }
                for(int k=n;k<=i;k++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
