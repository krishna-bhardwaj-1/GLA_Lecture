package Lecture_18;
import java.lang.*;
public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());//16
        //add
        sb.append("jhhkkkl");
        sb.append(true);;
        sb.append('a');
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(2));
        System.out.println(sb.reverse());
        System.out.println(sb.delete(1,3));
        System.out.println(sb.substring(0,4));
    }
}
