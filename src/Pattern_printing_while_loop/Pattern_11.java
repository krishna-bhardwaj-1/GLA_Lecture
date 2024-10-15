package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        /*
                 *
               *   *
             *   *   *
           *   *   *   *
         *   *   *   *   *
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1;
        int space = n - 1;
        while (row <= n) {
            int i = 1, j = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            while (j <= star) {
                if (j % 2 != 0) System.out.print("* ");
                else System.out.print("  ");
                j++;
            }
            System.out.println();
            star += 2;
            space--;
            row++;
        }
    }
}
