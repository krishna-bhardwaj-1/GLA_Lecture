package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        /*
                  *
               *     *
            *           *
         *                 *
            *           *
               *     *
                  *
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n/2;
        int space2=0;
        int star=1;
        while(row<=n){
            int i=1,j=1,k=1,l=1;
            while(i<=space){
                System.out.print("   ");
                i++;
            }
            while(j<=star){
                System.out.print("*  ");
                j++;
            }
            while (k<space2){
                System.out.print("   ");
                k++;
            }
            if(row==1||row==n) l=2;
            while(l<=star){
                System.out.print("*  ");
                l++;
            }
            if(row<=n/2){
                space--; space2+=2;
            }
            else{
                space++; space2-=2;
            }
            System.out.println();
            row++;
        }
    }
}
