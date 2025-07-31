package LinkedList_practice;

public class LinkedList_Scratch {
    class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    //O(1)
    public void AddFirst(int item){
        Node nn=new Node();
        nn.data=item;
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

    //O(1)
    public void AddLast(int item){
        if(size==0){
            AddFirst(item);
        }
        else {
            Node nn=new Node();
            nn.data=item;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }

    //O(N)
    private void AddatIndex(int item,int k) throws Exception{
        if(k==0){
            AddFirst(item);
        }
        else if(k==size){
            AddLast(item);
        }
        else {
            Node nn=new Node();
            nn.data=item;
            Node prev=GetNode(k-1);
            nn.next=prev.next;
            prev.next=nn;
            size++;
        }
    }

    public int GetFirst(){
        return head.data;
    }
    public int GetLast(){
        return tail.data;
    }
    public int GetaAtIndex(int idx) throws Exception{
        return GetNode(idx).data;
    }

    //O(N)
    public void Display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }

    public int removeFirst(){
        int rv=head.data;
        if(size==1){
            head=null;
            tail=null;
        }
        else {
            Node temp=head;
            head=head.next;
            temp.next=null;
            size--;
        }
        return rv;
    }
    public int removeLast() throws Exception{
        if(size==1){
            return removeFirst();
        }
        else {
            int rv=tail.data;
            Node sl=GetNode(size-2);
            sl.next=null;
            tail=sl;
            size--;
            return rv;
        }
    }

    public int removeAtIndex(int idx) throws Exception{
        if(idx==0){
            return removeFirst();
        }
        else if(idx==size-1){
            return removeLast();
        }
        else {
            Node prev=GetNode(idx-1);
            Node curr=GetNode(idx);
            prev.next=curr.next;
            curr.next=null;
            size--;
            return curr.data;
        }
    }

    //O(N)
    private Node GetNode(int idx) throws Exception{
        if(idx<0 || idx>=size){
            throw new Exception("bhai index valid nhi hai");
        }
        Node temp=head;
        for (int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp;
    }


    public int size(){
        return size;
    }
}
