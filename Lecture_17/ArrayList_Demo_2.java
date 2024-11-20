package Lecture_17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Demo_2 {
    public static void main(String[] args) {
        ArrayList<Integer> ll=new ArrayList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(7);
        ll.add(9);
        System.out.println(ll);
        Collections.sort(ll);
        Collections.reverse(ll);
        System.out.println(ll);
        //for each
        for(int i:ll){
            System.out.print(i+" ");
        }
    }
}
