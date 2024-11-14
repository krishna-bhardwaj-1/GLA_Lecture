package Leetcode;

public class Word_Pattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat fish";
        wordPattern(pattern,s);
    }
    public static void wordPattern(String pattern, String s) {
        String[] st=s.split(" ");
        if(pattern.length()!=st.length) System.out.println("nono");;
        int i=0;
        int j=st.length-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                if(st[i].equals(st[j])){
                    i++;
                    j--;
                }
                else {
                    System.out.println("nononoo");
                }
            }
            else {
                if(st[i]!=st[j]){
                    i++;
                    j--;
                }
                else {
                    System.out.println("nononoo");
                }
            }
        }
        System.out.println("yesssss");
    }
}
