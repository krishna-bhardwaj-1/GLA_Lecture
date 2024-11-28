package Leetcode;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(longest_substring(s));
    }
    public static int longest_substring(String s){
        int si=0;
        int ei=0;
        int ans=0;
        int[] arr=new int[128];
        while(ei<s.length()){
            //growing
            char ch=s.charAt(ei);
            arr[ch]++;
            //shrink
            while(arr[ch]>1&&si<=ei){
                arr[s.charAt(si)]--;
                si++;
            }
            //update
            ans=Math.max(ans,(ei-si+1));
            ei++;
        }
        return ans;
    }
}
