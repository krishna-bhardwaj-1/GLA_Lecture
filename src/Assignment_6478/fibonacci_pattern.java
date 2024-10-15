package Assignment_6478;

import java.util.Scanner;

public class fibonacci_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int row=1;
        int a=1;
        int b=1;
        while(row<=n){
            int i=1;
            while(i<=star){
                if(row==1) System.out.print(0+"\t");
                if(row==2) System.out.print(1+"\t");
                if(row>2) {
                    int c = a + b;
                    System.out.print(c + "\t");
                    a = b;
                    b = c;
                }
                i++;
            }
            star++;
            System.out.println();
            row++;
        }
    }
}
