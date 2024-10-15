package Pattern_printing;

import java.util.Scanner;

public class Q_26 {
    public static void main(String[] args) {
        /*
                         1
                      1  2  3
                   1  2  3  4  5
                1  2  3  4  5  6  7
             1  2  3  4  5  6  7  8  9
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("   ");
            }
            int c = 1;
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(" " + c + " ");
                c++;
            }
            System.out.println();
        }
    }
}