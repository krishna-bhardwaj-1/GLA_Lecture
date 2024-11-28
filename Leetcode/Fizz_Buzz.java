package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz {
    public static void main(String[] args) {
        int n=3;
        System.out.println(fizzBuzz(n));
    }
    public static List<String> fizzBuzz(int n) {
        List<String> ll=new ArrayList<String>(n);
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                ll.add("FizzBuzz");
            }
            else if(i%3==0){
                ll.add("Fizz");
            }
            else if(i%5==0){
                ll.add("Buzz");
            }
            else{
                ll.add(Integer.toString(i));
            }
        }
        return ll;
    }
}
