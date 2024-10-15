package codeforces;

import java.util.Scanner;

public class Morning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int c = 1;
            int d = 4;
            System.out.println(reverse(x));
            x = reverse(x);
            int sum = 0;
            while (d-- > 0) {
                int rem = x % 10;
                x /= 10;
                if (rem == 0){
                    rem = 10;
                }
                if (rem > c) {
                    sum += rem - c + 1;
                } else {
                    sum += c - rem + 1;
                }
                c = rem;
            }
            System.out.println(sum);
        }
    }
    public static int reverse(int x){
        int sum=0,d=4;
        while(d-->0){
            int rem=x%10;
            x/=10;
            sum*=10;
            sum+=rem;
        }
        return sum;
    }
}
