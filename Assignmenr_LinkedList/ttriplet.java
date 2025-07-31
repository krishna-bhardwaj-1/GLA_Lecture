package Assignmenr_LinkedList;

import java.util.Scanner;

public class ttriplet {
    static Node head=null;
    static Node tail=null;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        while (a-->0){
            addfirst(sc.nextInt());
        }
        Node head1=head;
        head=null;
        tail=null;
        while (b-->0){
            addfirst(sc.nextInt());
        }
        Node head2=head;
        head=null;
        tail=null;
        while (c-->0){
            addfirst(sc.nextInt());
        }
        Node head3=head;
        int target=sc.nextInt();
        triplet(head1,head2,head3,target);
    }

    static void triplet(Node head1,Node head2,Node head3,int target){
        boolean found=false;
        Node temp1=head1;
        while (temp1!=null && !found){
            Node temp2=head2;
            while (temp2!=null && !found){
                Node temp3=head3;
                while (temp3!=null && !found){
                    if((temp1.data+temp2.data+ temp3.data)==target){
                        System.out.print(temp1.data+" "+temp2.data+" "+ temp3.data);
                        found=true;
                    }
                    temp3=temp3.next;
                }
                temp2 = temp2.next;
            }
            temp1=temp1.next;
        }
    }
    static void addfirst(int item){
        Node nn=new Node(item);
        if(head==null || tail==null){
            head=nn;
            tail=nn;
        }
        else {
            tail.next=nn;
            tail=nn;
        }
    }
}
