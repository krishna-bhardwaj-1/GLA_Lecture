package Assignmenr_LinkedList;

import java.util.Scanner;

public class sum_of_two_linked_list {
    static Node head=null;
    static Node tail=null;
    static Node head2=null;
    static Node tail2=null;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for (int i=0;i<n;i++){
            addfirst(sc.nextInt());
        }
        for (int i=0;i<m;i++){
            addsecod(sc.nextInt());
        }
        int len=length(head);
        int len2=length(head2);
        Node result;
        if(len>len2){
            Node curr=head;
            for(int i=0;i<len-len2;i++){
                curr=curr.next;
            }
            int carry=sum_of_two(curr,head2,true);
            carry=addcarry(head,curr,carry);
            if(carry>0){
                Node nn=new Node(carry);
                nn.next=head;
                head=nn;
            }
            result=head;
        }
        else {
            Node curr=head2;
            for(int i=0;i<len2-len;i++){
                curr=curr.next;
            }
            int carry=sum_of_two(head,curr,false);
            carry=addcarry(head2,curr,carry);
            if(carry>0){
                Node nn=new Node(carry);
                nn.next=head2;
                head2=nn;
            }
            result=head2;
        }
        print(result);
    }

    private static int addcarry(Node head,Node curr,int carry){
        if(head==curr || carry==0){
            return carry;
        }
        int sum=head.data+carry;
        head.data=sum%10;
        return addcarry(head.next,curr,sum/10);
    }
    static int length(Node l1){
        Node m1=l1;
        int a=0;
        while(m1!=null) {
            a++;
            m1 = m1.next;
        }
        return a;
    }
    static void addfirst(int item){
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

    static void addsecod(int item){
        Node nn = new Node(item);
        if (head2 == null) {
            head2 = nn;
            tail2 = nn;
        } else {
            tail2.next = nn;
            tail2 = tail2.next;
        }
    }
    static int sum_of_two(Node temp1,Node temp2,boolean x){
        if(temp1==null && temp2==null){
            return 0;
        }
        int recans  = sum_of_two(temp1.next, temp2.next,x);
        int merans = recans + temp1.data + temp2.data;
        if(x){
            temp1.data=merans%10;
        }
        else temp2.data = merans % 10;
        return merans/10;
    }
    static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
