package Assignmenr_LinkedList;

import java.util.Scanner;

public class LL_k_Reverse {
    static Node head=null;
    static Node tail=null;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        while (n-->0){
            addlast(sc.nextInt());
        }
        head=reversek(head,k);
        print(head);
    }
    public static void addlast(int item){
        Node nn=new Node(item);
        if(head==null && tail==null){
            head=nn;
            tail=nn;
        }
        else {
            tail.next=nn;
            tail=tail.next;
        }
    }

    static Node reversek(Node head,int k){
        Node start=head,end=head;
        for (int i=0;i<k;i++){
            if(end==null){
                return head;
            }
            else end=end.next;
        }
        Node newnode=reverse(start,end);
        start.next=reversek(end,k);
        return newnode;
    }
    static Node reverse(Node head,Node end){
        Node prev=null;
        Node curr=head;
        while (curr!=end){
            Node add=curr.next;
            curr.next=prev;
            prev=curr;
            curr=add;
        }
        return prev;
    }
    static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
