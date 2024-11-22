package Assignment_String;

import java.util.Scanner;

public class Strings_Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                sb.append(s.charAt(i));
            }
        }
        sb.append(s.charAt(s.length()-1));
        System.out.println(sb);
    }
}
