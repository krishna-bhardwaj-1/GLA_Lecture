package Lecture_25_30Jan;

public class Partition {
    public static void main(String[] args) {
        String s="123";
        sol(s,"");
    }
    private static void sol(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int cut=1;cut<=s.length();cut++){
            String st=s.substring(0,cut);
            sol(s.substring(cut), ans+st+"|");
        }
    }
}
