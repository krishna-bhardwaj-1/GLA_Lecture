package Leetcode;

import java.util.Scanner;

public class Water_bottles_1518LC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numBottles=sc.nextInt();
        int numExchange=sc.nextInt();
        int ans=numBottles;
        while(numBottles>=numExchange){
            int newbottle=numBottles/numExchange;
            int rembottle=numBottles%numExchange;
            ans+=newbottle;
            numBottles=newbottle+rembottle;
        }
        System.out.println(ans);
    }
}
