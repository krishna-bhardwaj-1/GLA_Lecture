package Lecture_33_27Mar;

public class client {
    public static void main(String[] args) {
        P obj=new C();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        System.out.println(((C)obj).d);
        System.out.println(((C)obj).d2);
        obj.fun();
        obj.fun1();
    }
}
