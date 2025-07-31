package Lecture_23_16Jan;

public class permutation2 {
    public static void main(String[] args) {
        String ques="abca";
        sol(ques,"");
    }
    private static void sol(String input,String ans){
        if(input.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<input.length();i++){
            char ch= input.charAt(i);
            if(!isvalid(input,i+1,ch)) {
                String bchikuchistring = input.substring(0, i) + input.substring(i + 1);
                sol(bchikuchistring, ans + ch);
            }
        }
    }
    public static boolean isvalid(String str,int i,char ch){
        for(int k=i;k<str.length();k++){
            if(str.charAt(k)==ch){
                return true;
            }
        }
        return false;
    }
}
