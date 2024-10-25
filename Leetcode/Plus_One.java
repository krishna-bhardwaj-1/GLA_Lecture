package Leetcode;

import java.util.*;
public class Plus_One {
    public static void main(String[] args) {
        int[] digits={9};
        int[] a=plus(digits);
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
    }
    public static int[] plus(int[] digits){
    for(int i=digits.length-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }
        digits[i]=0;
    }
    digits=new int[digits.length+1];
    digits[0]=1;
    return digits;
    }
}
