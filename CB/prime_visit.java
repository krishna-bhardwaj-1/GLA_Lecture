package CB;

import java.util.Scanner;

public class prime_visit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int s=0;
            for(int p=a;p<=b;p++) {
                int c = 0;
                for (int i = 1; i <= p / 2; i++) {
                    if (p % i == 0) c++;
                }
                if (c == 1) s++;
            }
            System.out.println(s);
            n--;
        }
    }
}
