package Pattern_printing;

import java.util.Scanner;

public class Q_13 {
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
        for(int i=1;i<=2*n;i++){
            if(i<=n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int j=i;j<2*n;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
