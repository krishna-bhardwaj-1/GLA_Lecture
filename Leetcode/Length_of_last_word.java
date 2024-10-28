package Leetcode;

public class Length_of_last_word {
    public static void main(String[] args) {
        String s="hello world";
        System.out.println(lastwordlength(s));
    }
    public static int lastwordlength(String s){
        s=s.trim();
        char[] ch=s.toCharArray();
        int c=0;
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]!=' '){
                c++;
            }
            else {
                break;
            }
        }
        return c;
    }
}
