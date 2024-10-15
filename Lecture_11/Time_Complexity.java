package Lecture_11;

public class Time_Complexity {
    //Time and space complexity
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for (int i=0;i<100000;i++){

        }
        long end=System.currentTimeMillis();
        System.out.println(start);
        System.out.println(end);
        System.out.println(end-start);
    }
}
