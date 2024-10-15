package Lecture_5;

import java.util.Scanner;

public class pascals_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int row=0;
        while(row<n){
            int i=0;
            int ncr=1;
            while(i<star){
                System.out.print(ncr+" ");
                ncr=((row-i)*ncr)/(i+1);
                i++;
            }
            star++;
            System.out.println();
            row++;
        }
    }
}
