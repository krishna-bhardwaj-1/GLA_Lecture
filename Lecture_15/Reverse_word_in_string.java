package Lecture_15;

import java.util.Arrays;

public class Reverse_word_in_string {
    public static void main(String[] args) {
        String s="   the sky is    blue     ";
        s=s.trim();
//        System.out.println(s);
        String[] arr=s.split("\s+");
//        System.out.println(Arrays.toString(arr));
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";
        }
        System.out.println(ans);
    }
}
