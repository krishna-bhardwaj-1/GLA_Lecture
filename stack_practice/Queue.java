package stack_practice;

public class Queue {
    private int[] arr;
    int front=0;
    int size=0;

    public Queue(){
        arr=new int[5];
    }
    public Queue(int n){
        arr=new int[n];
    }

    public boolean Isempty(){
        return size==0;
    }

    public void Equeue(int item){
        int idx=(front+size)%arr.length;
        arr[idx]=item;
        size++;
    }

    public int Dequeue(){
        int rv=arr[front];
        front=(front+1)%arr.length;
        size--;
        return rv;
    }

    public int getFront(){
        return arr[front];
    }

    public boolean isfull(){
        return size==arr.length;
    }

    public void display(){
        for (int i=0;i<size;i++){
            int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
}
