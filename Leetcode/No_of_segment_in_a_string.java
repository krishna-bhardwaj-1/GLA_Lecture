package Leetcode;

public class No_of_segment_in_a_string {
    public static void main(String[] args) {
        String s=" ";
        System.out.println(segments(s));
    }
    public static int segments(String s){
        if(s.length()==0||s==null){
            return 0;
        }
        String[] arr=s.split("\s+");
        return arr.length;
    }
}
