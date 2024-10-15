package Lecture_3;

import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        if(w<1 ||w>100) System.out.print("NO");
        if(w%2!=0||(w/2)%2!=0) System.out.print("NO");
        else System.out.print("YES");
    }
}
