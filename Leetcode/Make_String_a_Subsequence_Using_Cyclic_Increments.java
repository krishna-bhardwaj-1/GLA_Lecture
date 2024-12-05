package Leetcode;

public class Make_String_a_Subsequence_Using_Cyclic_Increments {
    public static void main(String[] args) {
        String str1="fp";
        String stt2="p";
        System.out.println(canMakeSubsequence(str1,stt2));
    }
    public static boolean canMakeSubsequence(String str1, String str2) {
        int i=0;
        int j=0;
        boolean c=true;
        while(i<str1.length()&&j<str2.length()){
            if(str1.charAt(i)!=str2.charAt(j)){
                char ch= str1.charAt(i);
                char ch2=str2.charAt(j);
                if(ch=='z'){
                    ch-=26;
                }
                if(ch+1==ch2){
                    c=true;
                    i++;
                    j++;
                }
                else {
                    c=false;
                    i++;
                }
            }
            else {
                c=true;
                i++;
                j++;
            }
        }
        return c && i == str1.length() && j == str2.length();
    }
}
