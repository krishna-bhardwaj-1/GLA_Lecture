package Leetcode;

import java.util.Scanner;

import static java.util.Collections.reverse;

public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(convertToTitle(n));
    }
    public static String convertToTitle(int n) {
        StringBuilder ans=new StringBuilder();
        if(n<=26){
            ans.append((char) (n % 26 + 64));
            return ans.toString();
        }
        else{
            while(n>0){
                ans.append((char) (n % 26 + 64));
                n/=26;
            }
        }
        ans.reverse();
        return ans.toString();
    }
}
