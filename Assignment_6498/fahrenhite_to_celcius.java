package Assignment_6498;

import java.util.Scanner;

public class fahrenhite_to_celcius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        while(a<=b){
            System.out.println(a+" "+(5*(a-32))/9);
            a+=c;
        }
    }
}
