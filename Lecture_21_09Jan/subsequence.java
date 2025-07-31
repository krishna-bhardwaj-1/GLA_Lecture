package Lecture_21_09Jan;

public class subsequence {
    public static void main(String[] args) {
        sol("kush","");
    }
    public static void sol(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char cc=s.charAt(0);
        //inclusion
        sol(s.substring(1),ans+cc);
        //exclusion
        sol(s.substring(1),ans);
    }
}
