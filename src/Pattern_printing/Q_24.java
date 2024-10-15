package Pattern_printing;

import java.util.Scanner;

public class Q_24 {
    public static void main(String[] args) {
        /*
                    1
                  2 2 2
                3 3 3 3 3
              4 4 4 4 4 4 4
            5 5 5 5 5 5 5 5 5
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=(2*i-1);k++)
                System.out.print(i+" ");
            System.out.println();

        }
    }
}
