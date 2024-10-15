package Assignment_6478;
import java.util.Scanner;
public class Pascals_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 0;
        while (row < n) {
            int i = 0;
            int c = 1;
            while (i < star) {
                System.out.print(c + " ");
                c = ((row - i) * c) / (i + 1);
                i++;
            }
            row++;
            System.out.println();
            star++;
        }
    }
}
