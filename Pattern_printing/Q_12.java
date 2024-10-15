package Pattern_printing;

import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        /*
                *
              * ! *
            * ! * ! *
          * ! * ! * ! *
         * ! * ! * ! * ! *
         */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for( i=1;i<=n;i++){
            for(j=i;j<n;j++){
                System.out.print("   ");
            }
            for(k=1;k<=2*i-1;k++){
                if(i%2!=0) {
                    if ((i + k) % 2 != 0) System.out.print(" ! ");
                    else System.out.print(" * ");
                }
                if(i%2==0){
                    if((i+k)%2==0) System.out.print(" ! ");
                    else System.out.print(" * ");
                }
            }
            System.out.println();
        }

    }
}
