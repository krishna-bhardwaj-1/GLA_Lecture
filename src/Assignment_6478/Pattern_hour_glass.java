package Assignment_6478;

import java.util.Scanner;

public class Pattern_hour_glass {
    public static void main(String[] args) {
        /*
                          5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4
                              3 2 1 0 1 2 3
                                2 1 0 1 2
                                  1 0 1
                                    0
                                  1 0 1
                                2 1 0 1 2
                              3 2 1 0 1 2 3
                            4 3 2 1 0 1 2 3 4
                          5 4 3 2 1 0 1 2 3 4 5
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=0;
        int star=2*n+1;
        while(row<=2*n+1){
            int i=1,j=1,p=n;
            while (i<=space){
                System.out.print("  ");
                p--;
                i++;
            }
            while(j<=star){
                System.out.print(p+" ");
                if(j<=star/2) p--;
                else p++;
                j++;
            }
            if(row<=n){
                space++;
                star -= 2;
            }
            else{
                space--;
                star+=2;
            }
            System.out.println();
            row++;
        }
    }
}
