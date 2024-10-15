package Lecture_1;

public class Inc_dec {
    public static void main(String[] args) {
        System.out.println("By using the concept of pre-increment and pre-decrement.");
        int a=9;
        int x=a++ - ++a - 7 + --a + a--;
        System.out.println(x);
    }
}
