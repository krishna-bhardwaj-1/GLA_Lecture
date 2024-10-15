package Pattern_printing;

import java.util.Scanner;

public class Q_21 {
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
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=i;k<(2*n-i)-1;k++){
                System.out.print("  ");
            }
            if(i<n) {
                for (int l = 1; l <= i; l++) {
                    System.out.print("* ");
                }
            }
            else{
                for(int c=1;c<i;c++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
