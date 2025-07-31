package stack_practice;

public class stack_client {
    public static void main(String[] args) throws Exception {
        stack st=new stack(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        st.push(90);
        st.push(90);
        st.display();
        st.push(2);
    }
}
