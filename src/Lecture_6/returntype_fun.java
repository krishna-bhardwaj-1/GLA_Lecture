package Lecture_6;

public class returntype_fun {
    public static void main(String[] args) {
        System.out.println("Helooo");
        int a=8;
        int b=7;
        System.out.println(Add(a,b));
        System.out.println("Bye");
    }
    public static int Add(int a,int b){
        int c=a+b;
        return c;
    }
}
