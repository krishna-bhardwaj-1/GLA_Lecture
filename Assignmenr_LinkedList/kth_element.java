package Assignmenr_LinkedList;

import java.util.Scanner;

public class kth_element {
    static Node head=null;
    static Node tail=null;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==0){
            System.out.println();
            return;
        }
        int c=0;
        while (true){
            int x=sc.nextInt();
            if(x==-1){
                break;
            }
            else {
                add(x);
                c++;
            };
        }
        int k=sc.nextInt();
        System.out.println(find(head,c-k));
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
    static int find(Node head,int k){
        Node temp=head;
        while (k!=0){
            k--;
            temp=temp.next;
        }
        return temp.data;
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
