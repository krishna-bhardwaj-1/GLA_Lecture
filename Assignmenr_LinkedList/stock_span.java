package Assignmenr_LinkedList;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class stock_span {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<n;i++){
            while (!st.isEmpty() && arr[i]>=arr[st.peek()]){
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
        for (int i:ans){
            System.out.print(i+" ");
        }
        System.out.print("END");
    }
}
