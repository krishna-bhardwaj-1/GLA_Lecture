package Pattern_printing;

import java.util.Scanner;

public class Q_31 {
    public static void main(String[] args) {
        /*
        5 4 3 2 *
        5 4 3 * 1
        5 4 * 2 1
        5 * 3 2 1
        * 4 3 2 1
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int c=5;
            for(int j=1;j<=n;j++) {
                if(i+j==6) System.out.print("* ");
                else System.out.print(c + " ");
                c--;
            }
            System.out.println();
        }
    }
}
