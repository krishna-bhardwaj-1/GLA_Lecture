package stack_practice;

import java.security.spec.ECField;

public class stack {
    private int[] arr;
    private int idx=-1;
    public stack(int n){
        arr=new int[n];
    }

    public void push(int item) throws Exception {
        if(isfull()){
            throw new Exception("bklol stack full hai bewkoof");
        }
        idx++;
        arr[idx]=item;
    }
    public int pop(){
        int rv=arr[idx];
        idx--;
        return rv;
    }

    public int peek(){
        return arr[idx];
    }

    public void display(){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public boolean isempty(){
        return idx==-1;
    }

    public int size(){
        return idx+1;
    }

    public boolean isfull(){
        return idx==arr.length-1;
    }
}
