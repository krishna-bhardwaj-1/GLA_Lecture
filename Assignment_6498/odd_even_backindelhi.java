package Assignment_6498;

import java.util.Scanner;

public class odd_even_backindelhi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0) {
            int n = sc.nextInt();
            int sum1 = 0, sum2 = 0;
            while (n > 0) {
                int rem = n % 10;
                if (rem % 2 != 0) sum1 += rem;
                else sum2 += rem;
                n /= 10;
            }
            if (sum1 % 3 == 0 || sum2 % 4 == 0) System.out.println("Yes");
            else System.out.println("No");
            a--;
        }
    }
}
