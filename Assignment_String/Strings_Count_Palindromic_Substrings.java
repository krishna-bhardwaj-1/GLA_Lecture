package Assignment_String;

import java.util.Scanner;

public class Strings_Count_Palindromic_Substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(validpalindromeSubString(st));
    }
    public static int validpalindromeSubString(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(ispalindrome(s.substring(i,j))) c++;
            }
        }
        return c;
    }
    public static boolean ispalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
