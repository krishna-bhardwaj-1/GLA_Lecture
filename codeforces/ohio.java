package codeforces;

import java.util.Scanner;

public class ohio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t--> 0) {
            String s = in.next();
            int c = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    System.out.println(1);
                    c = 1;
                    break;
                }
            }
            if (c == 0) {
                System.out.println(s.length());
            }
        }
    }
}
