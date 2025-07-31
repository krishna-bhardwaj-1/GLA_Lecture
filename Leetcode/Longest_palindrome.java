package Leetcode;

public class Longest_palindrome {
    static int len;
    public static void main(String[] args) {
        len=0;
        String s="abccccdd";
        subsequnce(s,"");
    }
    public static void subsequnce(String s, String ans){
        //basecase
        if(s.length()==0){
            if(palindrome(ans)){
                System.out.println(ans);
                len=Math.max(ans.length(),len);
            }
            return;
        }
        char cc=s.charAt(0);
        subsequnce(s.substring(1),ans+cc);
        subsequnce(s.substring(1),ans);
    }
    private static boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
