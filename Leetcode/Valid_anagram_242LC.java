package Leetcode;

import java.util.Arrays;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
public class Valid_anagram_242LC {
    public static void main(String[] args) {
        String s="anagram";
        String t="naaram";
        System.out.println(anagram(s,t));
    }
    public static boolean anagram(String s,String t){
        if(s.length()!=t.length())
            return false;
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        return (Arrays.equals(sc,tc));
    }
}
