package Leetcode;

public class string_halves {
    public static void main(String[] args) {
        String s="book";
        String st=s.toLowerCase();
        int mid=st.length()/2;
        String pre=st.substring(0,mid);
        System.out.println(pre);
        String fin=st.substring(mid);
        System.out.println();
        System.out.println(vowel(pre));
        System.out.println(vowel(fin));
        if(vowel(pre)==vowel(fin)){
            System.out.println("true");
        }
        System.out.println("false");
    }
    private static int vowel(String s){
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c++;
            }
        }
        return c;
    }
}
