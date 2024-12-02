package Leetcode;

import java.util.Arrays;

public class Check_If_a_Word_Occurs_As_a_Prefix {
    public static void main(String[] args) {
        String s="i love eating burger";
        String search="burg";
        System.out.println(isPrefixOfWord(s,search));
    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] s=sentence.split(" +");
        System.out.println(Arrays.toString(s));
        int len=searchWord.length();
        for(int i=0;i<s.length;i++){
            if(s[i].length()>=len){
            if(s[i].substring(0, len).equals(searchWord)) {
                return i+1;
            }
            }
        }
        return -1;
    }
}
