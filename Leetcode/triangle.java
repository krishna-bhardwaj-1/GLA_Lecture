package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class triangle {
    public static void main(String[] args) {
        System.out.println("cba".contains("abc"));
    }
    public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int cr=0;
        int cc=0;
        int sum=0;
        while(cr<= triangle.size()){
            sum+= triangle.get(cr).get(cc);
            cr++;
            if(triangle.get(cr).get(cc)>triangle.get(cr).get(cc+1)){
                cc++;
            }
        }
        return sum;
    }
}
