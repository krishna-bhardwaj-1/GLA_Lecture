package Assignmenr_LinkedList;

import java.util.Scanner;

public class rotate_a_ll {
    static Node head=null;
    static Node tail=null;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        while (n-->0){
            addfirst(sc.nextInt());
        }
        int k=sc.nextInt();
        head=rotate(head,k,t);
        print(head);
    }
    static void addfirst(int item){
        Node nn=new Node(item);
        if(head==null && tail==null){
            head=nn;
            tail=nn;
        }
        else {
            tail.next=nn;
            tail=nn;
        }
    }
    static Node rotate(Node head,int k,int size){
        if(head==null || k==0){
            return head;
        }
        Node temp=head;
        tail.next=temp;
        k=k%size;
        int c=size-k;
        while (c-->1){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
    static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
