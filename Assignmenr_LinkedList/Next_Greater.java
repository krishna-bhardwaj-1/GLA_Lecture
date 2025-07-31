package Assignmenr_LinkedList;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Next_Greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        nextgreater(arr);
    }
    private static void nextgreater(int[] arr){
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<arr.length;i++){
            while (!st.isEmpty() && arr[i]>arr[st.peek()]){
                arr[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()){
            arr[st.pop()]=-1;
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
