package Lecture_17;

public class Static_Fun_Demo {
    static int val=100;
    public static void main(String[] args) {
        System.out.println(val);
        System.out.println(Add(2,7));
        System.out.println(val);
    }
    public static int Add(int a,int b){
        int val=90;
        val=val+5;
        Static_Fun_Demo.val=Static_Fun_Demo.val+5;
        return a+b;
    }
}
