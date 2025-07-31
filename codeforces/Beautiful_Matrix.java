package codeforces;

import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0,y=0;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                int c=sc.nextInt();
                if(c==1) {
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println(Math.abs(x-3)+Math.abs(y-3));
    }
}
