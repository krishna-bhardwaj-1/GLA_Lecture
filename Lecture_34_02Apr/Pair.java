package Lecture_34_02Apr;

public class Pair <T,P>{
    T x;
    P y;
    public Pair(){

    }
    public Pair(T x,P y){
        this.x=x;
        this.y=y;
    }

    public T getX(){
        return x;
    }

    public static void main(String[] args) {
        Pair<Integer,Character> p1=new Pair<>();
        Pair<String,Boolean> p2=new Pair<>();
    }
}
