package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_30 {
    public static void main(String[] args) {
        /*
                5  4  3  2  1
                5  4  3  2  1
                5  4  3  2  1
                5  4  3  2  1
                5  4  3  2  1
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=5;
        int row=1;
        while(row<=n){
            int val=n;
            int i=1;
            while(i<=star){
                System.out.print(val+"  ");
                val--;
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
