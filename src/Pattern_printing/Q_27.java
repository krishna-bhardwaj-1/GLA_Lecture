package Pattern_printing;

import java.util.Scanner;

public class Q_27 {
    public static void main(String[] args) {
        {
        /*
                             1
                          1  2  1
                       1  2  3  2  3
                    1  2  3  4  3  4  3
                 1  2  3  4  5  4  5  4  5
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
                    if(c>=i) c--;
                    else c++;
                }
                System.out.println();
            }
        }
    }
}
