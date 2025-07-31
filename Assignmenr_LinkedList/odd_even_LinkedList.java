package Assignmenr_LinkedList;

import java.util.Scanner;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class odd_even_LinkedList {
    static Node head=null;
    static Node tail=null;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==0){
            System.out.println();
            return;
        }
        for (int i=0;i<n;i++){
            add(sc.nextInt());
        }
        head=odd_even(head);
        print(head);
    }
    static void add(int item){
        Node nn=new Node(item);
        if(head==null){
            head=nn;
            tail=nn;
        }
        else {
            tail.next=nn;
            tail=tail.next;
        }
    }
    static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    static Node odd_even(Node head){
        Node oddhead=new Node(-1);
        Node evenhead=new Node(-1);
        Node odd=oddhead,even=evenhead;
        Node temp=head;
        while(temp!=null){
            if(temp.data%2!=0){
                odd.next=temp;
                odd=odd.next;
            }
            else{
                even.next=temp;
                even=even.next;
            }
            temp=temp.next;
        }
        if(evenhead.next!=null){
            odd.next=evenhead.next;
            evenhead.next=null;
            even.next=null;
        }
        return oddhead.next;
    }
}


