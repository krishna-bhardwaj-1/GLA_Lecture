package Leetcode;

import java.util.ArrayList;

public class Pascals_Triangle {
    public static void main(String[] args) {
        int num=5;
        generate(num);
    }
    public static void generate(int numRows) {
        ArrayList<Integer> ll;
        ArrayList<ArrayList<Integer>> ll2=new ArrayList<>();
        int star=1;
        int row=0;
        while(row<numRows){
            ll=new ArrayList<>();
            int i=0;
            int ncr=1;
            while(i<star){
                ll.add(ncr);
                ncr=((row-i)*ncr)/(i+1);
                i++;
            }
            row++;
            star++;
            ll2.add(ll);
        }
        System.out.println(ll2);
    }
}
