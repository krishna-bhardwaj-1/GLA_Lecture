package Lecture_34_02Apr;

public class LinkedList {
    class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    // O(1)
    public void AddFirst(int item){
        Node nn=new LinkedList.Node();
        nn.val=item;
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else {
            nn.next=head;
            head=nn;
            size++;
        }
    }

}
