package Lecture_29_05Mar;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {
    public static void main(String[] args) {
        String str="IIIDIDD";
        System.out.println(Construct_Smallest_Number(str));
    }
    public static String Construct_Smallest_Number(String str){
        int[] ans=new int[str.length()+1];
        int c=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=str.length();i++){
            if(i==str.length()||str.charAt(i)=='I'){
                ans[i]=c;
                c++;
                while (!st.isEmpty()){
                    ans[st.pop()]=c;
                    c++;
                }
            }
            else {
                st.push(i);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i:ans){
            sb.append(i);
        }
        return sb.toString();
    }
}
