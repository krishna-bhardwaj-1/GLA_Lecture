package practice_endsem_3rd;

import java.util.Scanner;

public class pattern_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        int space=0;
        while(row<=n){
            //star
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }
            //space
            int j=1;
            while (j<space){
                System.out.print("  ");
                j++;
            }
            //star
            int k=1;
            if(row==1) k=2;
            while (k<=star){
                System.out.print("* ");
                k++;
            }
            star--;
            space+=2;
            row++;
            System.out.println();
        }
    }
}
