package Assignment_1;

import java.util.Scanner;

public class Mirror_star_pattern_pattern_5 {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n/2;
        int star=1;
        while(row<=n){
            int i=1,j=1;
            //space
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            //mirror
            if(row<=n/2) space--;
            else space++;
            if(row<=n/2) star+=2;
            else star-=2;
            //prep
            System.out.println();
            row++;
        }
    }
}
