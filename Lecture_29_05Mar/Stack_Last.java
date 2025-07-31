package Lecture_29_05Mar;

import java.util.Stack;

public class Stack_Last {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st);
        Add_last(st,6);
        System.out.println(st);
    }
    public static void Add_last(Stack<Integer> st,int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int x=st.pop();
        Add_last(st,item);
        st.push(x);
    }
}
