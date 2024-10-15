package Assignment_6478;

import java.util.Scanner;

public class pattern_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int star=1;
        int row=1;
        int val=1;
        while(row<=n){
            int i=1,j=1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            int p=val;
            while (j<=star){
                System.out.print(p+"\t");
                if(j<=star/2) p++;
                else p--;
                j++;
            }
            space--;
            star+=2;
            System.out.println();
            row++;
            val++;
        }
    }
}
