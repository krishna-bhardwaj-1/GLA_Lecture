package Assignment_recursion;

import java.util.Scanner;

public class keypad {
    static String[] mapping = { "","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    static int c;
    public static void main(String[] args) {
        c=0;
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        sol(n,"");
        System.out.print("\n"+c);
    }
    private static void sol(String digit,String comb){
        if(digit.length()==0){
            c++;
            System.out.print(comb+" ");
            return;
        }
        char ch=digit.charAt(0);
        int index=ch-'0';
        String mappedString=mapping[index];
        for(int i=0;i<mappedString.length();i++){
            String bachistring=digit.substring(1);
            char choice=mappedString.charAt(i);
            sol(bachistring,comb+choice);
        }
    }
}
