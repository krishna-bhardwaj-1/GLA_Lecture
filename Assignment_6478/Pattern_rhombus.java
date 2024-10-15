package Assignment_6478;

import java.util.Scanner;

public class Pattern_rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=n-1;
        int val=1;
        while (row <= 2*n-1) {
            int i=1,j=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int p=val;
            while(j<=star){
                System.out.print(p+" ");
                if(j<=(star/2)) p++;
                else p--;
                j++;
            }
            if(row<n){
                star+=2; space--; val++;
            }
            else{
                star-=2; space++; val--;
            }
            System.out.println();
            row++;
        }
    }
}
