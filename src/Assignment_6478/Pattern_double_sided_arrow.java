package Assignment_6478;

import java.util.Scanner;

public class Pattern_double_sided_arrow {
    public static void main(String[] args) {
        /*
                            1
                        2 1   1 2
                    3 2 1       1 2 3
                4 3 2 1           1 2 3 4
                    3 2 1       1 2 3
                        2 1   1 2
                            1
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int star=1;
        int midspc=0;
        int val=1;
        while (row<=n){
            int i=1,j=1,k=1,l=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int p=val;
            while (j<=star){
                System.out.print(p+" ");
                p--;
                j++;
            }
            while(k<midspc){
                System.out.print("  ");
                k++;
            }
            if(row==1||row==n) l=2;
            while(l<=star){
                System.out.print(l+" ");
                l++;
            }
            if(row<=n/2){ star++; space-=2; midspc+=2; val++;}
            else {star--; space+=2; midspc-=2; val--;}
            System.out.println();
            row++;
        }
    }
}
