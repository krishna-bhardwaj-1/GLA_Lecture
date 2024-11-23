package Leetcode;

public class Ransom_Note {
    public static void main(String[] args) {
        String ransonote="a";
        String magazine="b";
        System.out.println(canConstruct(ransonote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] frequency=new int[26];
        for(int i=0;i<magazine.length();i++){
            frequency[magazine.charAt(i)-97]++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(frequency[ransomNote.charAt(i)-97]==0){
                return false;
            }
            frequency[ransomNote.charAt(i)-97]--;
        }
        return true;
    }
}
