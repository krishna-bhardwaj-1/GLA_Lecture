package stack_practice;

public class Queue_Reverse {
    public static void main(String[] args) throws Exception{
        Queue q=new Queue(6);
        q.Equeue(10);
        q.Equeue(20);
        q.Equeue(30);
        q.Equeue(40);
        q.Equeue(50);
        q.Equeue(60);
        q.display();
        Reverse(q);
        q.display();
    }

    public static void Reverse(Queue q) throws Exception{
        if(q.Isempty()){
            return;
        }
        int x=q.Dequeue();
        Reverse(q);
        q.Equeue(x);
    }
}
