package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class horseshoe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Integer> set=new HashSet<>();
        int n=4;
        while (n-->0){
            set.add(sc.nextInt());
        }
        System.out.println(4-set.size());
    }
}
