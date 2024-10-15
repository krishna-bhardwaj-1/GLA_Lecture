package Assignment_6478;

import java.util.Scanner;

public class Pattern_invertes_hour_glass {
    public static void main(String[] args) {
        /*
             5                   5
             5 4               4 5
             5 4 3           3 4 5
             5 4 3 2       2 3 4 5
             5 4 3 2 1   1 2 3 4 5
             5 4 3 2 1 0 1 2 3 4 5
             5 4 3 2 1   1 2 3 4 5
             5 4 3 2       2 3 4 5
             5 4 3           3 4 5
             5 4               4 5
             5                   5
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=2*n-1;
        int row=1;
        while(row<=2*n+1){
            int i=1,j=1,k=1,c=n;
            while (i <= star) {
                System.out.print(c+" ");
                c--;
                i++;
            }
            if(row==n+1) c=1;
            while(j<=space){
                if(j<=space/2) c--;
                else c++;
                System.out.print("  ");
                j++;
            }
            if(row==n+1) k=2;
            while(k<=star){
                System.out.print(c+" ");
                c++;
                k++;
            }
            if(row<=n){ star++; space-=2;}
            else {star--; space+=2;}
            System.out.println();
            row++;
        }
    }
}
