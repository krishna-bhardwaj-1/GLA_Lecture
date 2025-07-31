package Assignmenr_LinkedList;

import java.util.Scanner;
import java.util.Stack;

public class form_minimun_from_DI_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String str=sc.next();
            System.out.println(Construct(str));
        }
    }
    private static String Construct(String s){
        int[] arr=new int[s.length()+1];
        Stack<Integer> st=new Stack<>();
        int c=1;
        for (int i=0;i<=s.length();i++){
            if(i==s.length()||s.charAt(i)=='I'){
                arr[i]=c;
                c++;
                while (!st.isEmpty()){
                    arr[st.pop()]=c;
                    c++;
                }
            }
            else {
                st.push(i);
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i:arr){
            sb.append(i);
        }
        return sb.toString();
    }
}
