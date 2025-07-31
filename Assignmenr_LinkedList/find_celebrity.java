package Assignmenr_LinkedList;

import java.util.Scanner;
import java.util.Stack;

public class find_celebrity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] arr=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int x=celebrity(arr);
        if(x==-1){
            System.out.println("No Celebrity");
        }
        else System.out.println(x);
    }
    private static int celebrity(int[][] arr){
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<arr.length;i++){
            st.push(i);
        }
        while (st.size()>1){
            int a=st.pop();
            int b=st.pop();
            if(arr[a][b]==1){
                st.push(b);
            }
            else {
                st.push(a);
            }
        }
        int celebrity=st.pop();
        for (int i=0;i<arr.length;i++){
            if(i==celebrity){
                continue;
            }
            if(arr[celebrity][i]==1|| arr[i][celebrity]==0){
                return -1;
            }
        }
        return celebrity;
    }
}
