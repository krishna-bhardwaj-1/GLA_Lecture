package Assignment_String;

import java.util.Scanner;

public class Strings_Difference_in_Ascii_Codes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            sb.append(s.charAt(i));
            sb.append(s.charAt(i+1)-s.charAt(i));
        }
        sb.append(s.charAt(s.length()-1));
        System.out.println(sb);
    }
}
