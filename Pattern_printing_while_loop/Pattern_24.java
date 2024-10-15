package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_24 {
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
        int row=1;
        int space=n-1;
        int no=1;
        while(row<=n){
            int i=1,j=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            while(j<=no){
                System.out.print(row+" ");
                j++;
            }
            space--;
            no+=2;
            System.out.println();
            row++;
        }
    }
}
