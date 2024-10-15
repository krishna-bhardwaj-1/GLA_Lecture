package Lecture_1;

public class prime {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100.");
        for(int a=1;a<100;a++) {
            int c=0;
            for(int i=1;i<=(a/2);i++) {
                if(a%i==0) c++;
            }
            if(c<2)System.out.println(a);
        }
    }
}
