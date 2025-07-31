package Lecture_21_09Jan;

public class longest_palindromic_subsequnece {
    static int ch;
    public static void main(String[] args) {
        ch=0;
        String s="bbbab";
        genearte(s,"");
        System.out.println(ch);
    }
    private static void genearte(String input, String ans){
        if(input.length()==0){
            if(palindrome(ans)) {
                ch = Math.max(ch, ans.length());
            }
            return;
        }
        char cc=input.charAt(0);
        genearte(input.substring(1),ans+cc);
        genearte(input.substring(1),ans);
    }
    private static boolean palindrome(String ans){
        int i=0;
        int j=ans.length()-1;
        while(i<=j){
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
