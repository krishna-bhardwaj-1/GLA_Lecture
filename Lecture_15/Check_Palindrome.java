package Lecture_15;

public class Check_Palindrome {
    public static void main(String[] args) {
        String s1="nitin";
        System.out.println(palindrome(s1));
    }
    public static boolean palindrome(String s1){
        int i=0;
        int j=s1.length()-1;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
