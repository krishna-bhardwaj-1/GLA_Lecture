package Lecture_6;

public class returntype_fun2 {
    static int val=100;
    public static void main(String[] args) {
        System.out.println("Helooo");
        int a=8;
        int b=7;
        System.out.println(val);
        System.out.println(Add(a,b));
        System.out.println(val);
        System.out.println("Bye");
    }
    public static int Add(int a,int b){
        int c=a+b;
        int val=90;
        val=val-5;
        returntype_fun2.val=returntype_fun2.val-5;
        return c+sub(c,a);
    }
    public static int sub(int a,int b){
        return  a-b;
    }
}
