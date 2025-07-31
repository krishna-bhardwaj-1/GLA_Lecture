package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class guy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> set=new HashSet<>();
        int size1=sc.nextInt();
        for (int i=0;i<size1;i++){
            set.add(sc.nextInt());
        }

        int size2=sc.nextInt();
        for (int i=0;i<size2;i++){
            set.add(sc.nextInt());
        }
        if(set.size()==n){
            System.out.println("I become the guy.");
        }
        else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
