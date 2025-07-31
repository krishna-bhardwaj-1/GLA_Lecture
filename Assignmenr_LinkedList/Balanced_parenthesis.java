package Assignmenr_LinkedList;

import java.util.Stack;

public class Balanced_parenthesis {
    public static void main(String[] args) {
        String s="()[]{}";
        System.out.println(valid(s));
    }
    public static boolean valid(String s){
        Stack<Character> st=new Stack<>();
        for (char ch:s.toCharArray()){
            if(ch=='('|| ch=='{'|| ch=='['){
                st.push(ch);
            }
            else {
                if(st.isEmpty()){
                    return false;
                }
                char top=st.pop();
                if(top=='(' && ch==')') continue;
                if(top=='[' && ch==']') continue;
                if(top=='{' && ch=='}') continue;
                return false;
            }
        }
        return true;
    }
}
