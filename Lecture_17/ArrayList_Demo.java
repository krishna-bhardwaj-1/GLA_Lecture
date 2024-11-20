package Lecture_17;

import java.util.ArrayList;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> ll=new ArrayList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println(ll);
        ll.add(1,9);
        System.out.println(ll);
        System.out.println(ll.get(2));
        System.out.println(ll.remove(2));
        System.out.println(ll);
        System.out.println(ll.size());
        ll.set(1,101);
        System.out.println(ll);
    }
}
