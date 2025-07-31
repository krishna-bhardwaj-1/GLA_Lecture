package Lecture_21_09Jan;

public class ncoins {
    public static void main(String[] args) {
        int n=3;
        sol(n,"");
    }
    private static void sol(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
            sol(n - 1, ans + "H");
        }
        sol(n-1,ans+"T");
    }
}
