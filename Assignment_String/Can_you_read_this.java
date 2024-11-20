package Assignment_String;

import java.util.Scanner;

public class Can_you_read_this {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        print(str);
    }
    public static void print(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=65&& str.charAt(i)<=90){
                System.out.println();
                System.out.print(str.charAt(i));
            }
            else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
