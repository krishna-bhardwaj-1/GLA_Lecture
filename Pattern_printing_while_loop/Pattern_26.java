package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_26 {
    public static void main(String[] args) {
        /*
                                1
                            1	2	3
                        1	2	3	4	5
                    1	2	3	4	5	6	7
                1	2	3	4	5	6	7	8	9
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int no=1;
        while(row<=n){
            int i=1,j=1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            int val=1;
            while(j<=no){
                System.out.print(val+"\t");
                val++;
                j++;
            }
            space--;
            no+=2;
            System.out.println();
            row++;
        }
    }
}
