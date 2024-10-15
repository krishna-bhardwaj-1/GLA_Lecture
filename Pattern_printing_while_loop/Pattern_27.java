package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_27 {
public static void main(String[] args) {
    /*
                            1
                        1	2	1
                    1	2	3	2	1
                1	2	3	4	3	2	1
            1	2	3	4	5	4	3	2	1
     */
    //vertical mirroring   (star+1)/2 =
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int star=1;
        while(row<=n){
            int i=1,j=1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            int val=1;
            while(j<=star){
                System.out.print(val+"\t");
                if(j<=(star/2)) val++;
                else val--;
                j++;
            }

            space--;
            star+=2;
            System.out.println();
            row++;
        }
    }
}
