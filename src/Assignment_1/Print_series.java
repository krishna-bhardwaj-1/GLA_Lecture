package Assignment_1;

import java.util.Scanner;

public class Print_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=1;
        while(i<=a){
            if((3*i+2)%4!=0) System.out.println(3*i+2);
            else a++;
            i++;
        }
    }
}
