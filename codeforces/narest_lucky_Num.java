package codeforces;

import java.util.Scanner;

public class narest_lucky_Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long c=0;
        while (n>0){
            if(n%10==4 || n%10==7) {
                c++;
            }
            n/=10;
        }
        if(c==0){
            System.out.println("NO");
        }
        else {
            while (c > 0) {
                if (c % 10 != 4 && c % 10 != 7) {
                    System.out.println("NO");
                    break;
                }
                c /= 10;
            }
            if (c == 0) System.out.println("YES");
        }
    }
}
