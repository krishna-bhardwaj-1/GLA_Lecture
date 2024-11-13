package Lecture_15;

public class StringDemo {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");
        String s4=new String("hello");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);

        s1=s1+"bye";
        System.out.println(s1);

        String s5="hello"+"bye";
        String s6="hello"+"bye";
        System.out.println(s5==s6);

    }
}
