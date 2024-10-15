package Pattern_printing;

import java.util.Scanner;

public class Q_25 {
    public static void main(String[] args) {
        /*
                             1
                         2   3   4
                     5   6   7   8   9
                 10  11  12  13  14  15  16
             17  18  19  20  21  22  23  24  25
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        for(int i=1;i<=n;i++){
            if(c<10) {
                for (int j = i; j < n; j++) {
                    System.out.print("    ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print(" " + c + "  ");
                    c++;
                }
                System.out.println();
            }
            else{
                for (int j = i; j < n; j++) {
                    System.out.print("    ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print(" " + c + " ");
                    c++;
                }
                System.out.println();
            }
        }
    }
}
