package Leetcode;

public class Adding_Spaces_to_a_String {
    public static void main(String[] args) {
        String s="LeetcodeHelpsMeLearn";
        int[] arr={8,13,15};
        System.out.println(addSpaces(s,arr));
    }
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder str= new StringBuilder("");
        int c=0;
        for(int i=0;i<s.length();i++){
            if(i==spaces[c]){
                str.append(" ");
                if(c<spaces.length-1){
                    c++;
                }
            }
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}
