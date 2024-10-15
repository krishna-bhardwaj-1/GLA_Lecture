package Assignment_1;

import java.util.Scanner;

public class Pattern_inverted_hour_glass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=2*n+1;
        int star=1;
        int spaces=2*n-1;
        while(row>=1) {
            int i = 1, j = 1;
            //star
            int c = 5;
            while (i <= star) {
                System.out.print(c + " ");
                c--;
                i++;
            }
            //space
            while (j <= spaces) {
                System.out.print("@ ");
                j++;
            }
            //star
            for(int q=n;q>=1;q--){
                System.out.print(q);
            }
            if(row<=n){ star++; spaces-=2;}
            else{ star--; spaces+=2;}
            System.out.println();
            row--;
        }
    }
}
