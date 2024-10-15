package codeforces;

import java.util.Scanner;

public class yogurt_sale {
    public static void main(String[] args) {
        // 2 5 9     3 5 9
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        while(l>0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = n % 2;
            c *= a;
            int d = n / 2;
            d *= b;
            if (n * a < c + d) System.out.println(n * a);
            else System.out.println(c + d);
            l--;
        }
    }
}
