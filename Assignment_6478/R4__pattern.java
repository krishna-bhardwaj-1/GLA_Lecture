package Assignment_6478;

import java.util.Scanner;

public class R4__pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int row=1;
        while(row<=n){
            int i=1;
            while (i <= star) {
                System.out.print("*");
                i++;
            }
            star++;
            System.out.println();
            row++;
        }
    }
}
