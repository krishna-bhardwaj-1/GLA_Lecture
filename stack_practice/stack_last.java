package stack_practice;

import java.util.Stack;

public class stack_last {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        Add_Last(st,0);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }

    private static void Reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int  x=st.pop();
        Reverse(st);
        Add_Last(st,x);
    }
    private static void Add_Last(Stack<Integer> st,int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int x=st.pop();
        Add_Last(st,item);
        st.push(x);
    }
}
