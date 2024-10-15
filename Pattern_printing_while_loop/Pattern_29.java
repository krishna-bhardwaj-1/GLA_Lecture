package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_29 {
    public static void main(String[] args) {
        /*
                                1
                             2  0  2
                          3  0  0  0  3
                       4  0  0  0  0  0  4
                    5  0  0  0  0  0  0  0  5
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int sp=0;
        int star=1;
        int row=1;
        while (row<=n){
            int i=1,j=1,k=1,l=1;
            while(i<=space){
                System.out.print("   ");
                i++;
            }
            while(j<=star){
                System.out.print(row+"  ");
                j++;
            }
            while(k<sp){
                System.out.print("0  ");
                k++;
            }
            if(row==1) l=2;
            while (l<=star){
                System.out.print(row+" ");
                l++;
            }
            space--;
            sp+=2;
            System.out.println();
            row++;
        }
    }
}
