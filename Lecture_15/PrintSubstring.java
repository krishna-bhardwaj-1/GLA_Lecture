package Lecture_15;

public class PrintSubstring {
    public static void main(String[] args) {
        String s="hello";
        PrintSubString(s);
    }
    public static void PrintSubString(String s){
        for(int last=0;last<s.length();last++) {
            for (int i = last+1; i <= s.length(); i++) {
                System.out.println(s.substring(last,i));
            }
        }
    }
}
