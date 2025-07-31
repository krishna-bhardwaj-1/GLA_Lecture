package codeforces;

import java.util.Scanner;

public class skibidus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            sb.append('i');
            if (s.length() > 2) {
                for (int i = s.length() - 3; i >= 0; i--) {
                    sb.append(s.charAt(i));
                }
            }
            System.out.println(sb.reverse());
        }
    }
}
