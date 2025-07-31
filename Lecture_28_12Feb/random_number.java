package Lecture_28_12Feb;

import java.util.Random;

public class random_number {
    public static void main(String[] args) {
        int si=1000;
        int ei=100000;
        Random rn=new Random();
        for (int i=0;i<10;i++){
            int x=rn.nextInt(ei-si+1)+si;
            System.out.println(x);
        }
    }
}
