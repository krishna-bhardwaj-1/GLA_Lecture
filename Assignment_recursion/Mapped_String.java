package Assignment_recursion;

import java.util.Scanner;

public class Mapped_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sol(s, "");
    }
    private static void sol(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int cut=1;cut<=s.length();cut++){
            String st=s.substring(0,cut);
            int num=Integer.parseInt(st);
            if(num>=1 && num<=26) {
                sol(s.substring(cut), ans + (char) (num + 64));
            }
        }
    }
}
