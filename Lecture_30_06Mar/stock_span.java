package Lecture_30_06Mar;

import java.util.Arrays;
import java.util.Stack;

public class stock_span {
    public static void main(String[] args) {
        int[] arr={30,35,40,38,35};
        span(arr);
    }
    public static void span(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ans.length;i++){
            while (!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=i+1;
            }
            else {
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
