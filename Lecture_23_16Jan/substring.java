package Lecture_23_16Jan;

public class substring {
    public static void main(String[] args) {
        sol("aacb","");
    }
    private static void sol(String input,String ans){
        if(input.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<input.length();i++){
            char ch= input.charAt(i);
            String bchikuchistring=input.substring(0,i)+input.substring(i+1);
            sol(bchikuchistring,ans+ch);
        }
    }
}
