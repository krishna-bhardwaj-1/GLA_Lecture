package Lecture_6;
//parameterized function
public class parameterized_fun {
    public static void main(String[] args) {
        System.out.println("Helooo");
        int a=8;
        int b=7;
        Add(a,b);
        System.out.println("Bye");
    }
    public static void Add(int a,int b){
        int c=a+b;
        sub(c,a);
        System.out.println(c);
    }
    public static void sub(int a, int b){
        int c=a-b;
        System.out.println(c);
    }
}
