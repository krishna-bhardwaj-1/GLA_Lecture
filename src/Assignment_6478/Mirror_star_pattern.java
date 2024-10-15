package Assignment_6478;

import java.util.Scanner;

public class Mirror_star_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=n/2;
        while(row<=n){
            int i=1,j=1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            while(i<=star){
                System.out.print("*"+"\t");
                i++;
            }
            if(row<=n/2){
                star+=2; space--;
            }
            else{
                star-=2;  space++;
            }
            System.out.println();
            row++;
        }
    }
}
