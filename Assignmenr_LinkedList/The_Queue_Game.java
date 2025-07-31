package Assignmenr_LinkedList;

import java.util.Scanner;
class Queue {
    int size=0;
    public void Equeue(){
        size++;
    }
    public boolean Dequeue(){
        if(size<=0) return false;
        size--;
        return true;
    }
}

public class The_Queue_Game {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            boolean isvalid=true;
            Queue q=new Queue();
            for (int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x==1){
                    q.Equeue();
                }
                else {
                    if(q.Dequeue()==false){
                        isvalid=false;
                        break;
                    }
                }
            }
            System.out.println(isvalid?"valid":"Invalid");
        }
    }
}
