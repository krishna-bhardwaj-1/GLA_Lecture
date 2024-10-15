package Pattern_printing;

import java.util.Scanner;

public class Q_19 {
    public static void main(String[] args) {
        /*
         * * * * * * *
         * * *   * * *
         * *       * *
         *           *
         * *       * *
         * * *   * * *
         * * * * * * *
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            if(i<=(n/2+1)) {
                for (int j = i; j <= n / 2+1; j++)
                    System.out.print("* ");
                for (int k = 2; k <= 2*i-2; k++)
                    System.out.print("  ");
                if(i==1){
                for(int l=i;l<=n/2;l++)
                    System.out.print("* ");}
                else{
                    for(int l=i;l<=n/2+1;l++)
                        System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for (int j = n/2+1; j <=i; j++)
                    System.out.print("* ");
                for (int k = i; k < (2*n-i)-1; k++)
                    System.out.print("  ");
                if(i<n){
                for(int k=n/2+2;k<=i+1;k++)
                    System.out.print("* ");}
                else{for(int k=n/2+2;k<=i;k++){
                    System.out.print("* ");
                }}
                System.out.println();
            }
        }
    }
}
