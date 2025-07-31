package Assignmenr_LinkedList;


import java.util.Scanner;

class stack{
    private int[] arr;
    int idx=-1;

    public stack(int n){
        arr=new int[n];
    }

    public void push(int item){
        idx++;
        arr[idx]=item;
    }

    public void pop(){
        idx--;
    }

    public int top(){
        return arr[idx];
    }

    public int getMin(){
        int min=Integer.MAX_VALUE;
        for (int i=0;i<=idx;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
}
public class Min_Stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        int p=0;
        for (int i=0;i<n;i++){
            arr[i]=sc.next();
            if(arr[i].equals("push")){
                p++;
            }
        }
        stack st=new stack(p);
        for (int i=0;i<arr.length;i++){
            if(arr[i].equals("push")){
                st.push(sc.nextInt());
            }
            else if(arr[i].equals("pop")){
                st.pop();
            }
            else if(arr[i].equals("top")){
                System.out.print(st.top()+" ");
            }
            else {
                System.out.print(st.getMin()+" ");
            }
        }
    }
}
