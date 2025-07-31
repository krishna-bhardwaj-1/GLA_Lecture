package Oops;

public class studentClient {
    public static void main(String[] args) {
        student s=new student();
        System.out.println(s.name);
        System.out.println(s.age);
        s.introduce_yourself();
        s.name="kaju";
        s.age=20;
        s.introduce_yourself();
    }
}
