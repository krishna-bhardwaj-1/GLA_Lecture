package Assignment_6498;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextByte();
        int b=sc.nextByte();
        int c=a;
        while(c>0){
            if(c%a==0&&c%b==0){
                System.out.println(c); break;
            }
            c++;
        }
    }
}
