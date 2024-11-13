package Leetcode;

public class First_Unique_Character_in_String {
    public static void main(String[] args) {
        String s="loveleetcode";
//        System.out.println(s.charAt(0)-97);
        unique(s);
    }
    public static void unique(String s){
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-97]+=1;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-97]==1){
                System.out.println(s.charAt(i));
                break;
            }
        }
        System.out.println(-1);
    }
}
