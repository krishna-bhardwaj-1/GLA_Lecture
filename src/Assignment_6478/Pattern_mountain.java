package Assignment_6478;

import java.util.Scanner;

public class Pattern_mountain {
    public static void main(String[] args) {
        /*
                       1           1
                       1 2       2 1
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=2*n-2;
        while (row<=n){
            int i=1,j=1,k=1,c=1;
            while (i<=star){
                System.out.print(c+" ");
                c++;
                i++;
            }
            int p=n;
            if(space==0) p--;
            while (j<space){
                System.out.print("  ");
                if(j>=space/2) p--;
                j++;
            }
            if(row==n) k=2;
            while (k<=star){
                System.out.print(p+" ");
                p--;
                k++;
            }
            star++;
            space-=2;
            System.out.println();
            row++;
        }
    }
}
