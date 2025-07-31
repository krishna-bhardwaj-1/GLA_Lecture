package Lecture_30_06Mar;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        int[] arr={4,5,2,10};
        NGE(arr);
    }
    public static void NGE(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ans.length;i++){
            while (!st.isEmpty() && arr[i]>arr[st.peek()]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        System.out.println(Arrays.toString(ans));
    }
}
