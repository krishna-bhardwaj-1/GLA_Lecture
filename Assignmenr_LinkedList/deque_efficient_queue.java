package Assignmenr_LinkedList;

import java.util.Scanner;
import java.util.Stack;

public class deque_efficient_queue {
    static class Queue{
        Stack<Integer> s1;
        Stack<Integer> s2;
        public Queue(){
            s1=new Stack<>();
            s2=new Stack<>();
        }
        public void enqueue(int x){
            s1.push(x);
        }
        public int dequeue(){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int rv=s2.pop();
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return rv;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            q.enqueue(i);
        }
        for (int i=0;i<n;i++){
            System.out.print(q.dequeue()+" ");
        }
    }
}
