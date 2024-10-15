package Lecture_1;

public class max_3_numbers {
    public static void main(String[] args) {
        int a=7;
        int b=11;
        int c=10;
        if(a>b&&a>c) {
            System.out.println(a);
        }
        else if(b>a&&b>c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
