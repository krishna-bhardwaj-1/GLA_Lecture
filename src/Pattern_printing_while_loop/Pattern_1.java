package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=n;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
