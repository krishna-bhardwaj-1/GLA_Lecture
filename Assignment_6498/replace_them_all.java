package Assignment_6498;

import java.util.Scanner;

public class replace_them_all {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        if(n==0) System.out.print('5');
        else {
            Long i = 1L, s = 0L;
            while (n > 0) {
                long c = (n % 10);
                if (c == 0) c = 5L;
                s = (s + (c * i));
                n = n / 10L;
                i *= 10L;
            }
            System.out.print(s);
        }
    }
}
