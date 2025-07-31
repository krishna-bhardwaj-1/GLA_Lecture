package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class count_beaytiful_substring {
    static int c;
    public static void main(String[] args) {
        c=0;
        String s="baeyh";
        int k=2;
        for(int i=0;i<s.length();i++){
            sol(s,i,new ArrayList<>(),k);
        }
        System.out.println(c);
    }
    public static void sol(String input, int ei, List<Character> ans, int k){
        while(ei<input.length()){
            //grow
            ans.add(input.charAt(ei));
            //update
            if(beauty(ans, k)){
                System.out.println(ans);
                c++;
            }
            ei++;
        }
    }
    private static boolean beauty(List<Character> ans,int k){
        int vov=0,con=0;
        for(int i=0;i<ans.size();i++){
            char ch=ans.get(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vov++;
            else con++;
        }
        return vov==con && vov!=0 && (vov*con)%k==0;
    }
}
