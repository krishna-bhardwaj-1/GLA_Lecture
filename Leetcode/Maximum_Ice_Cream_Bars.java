package Leetcode;

import java.util.Arrays;

public class Maximum_Ice_Cream_Bars {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,1};
        int coins=7;
        System.out.println(maxIceCream(arr,coins));
    }
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]<=coins){
                c++;
                coins-=costs[i];
            }
            else{
                break;
            }
        }
        return c;
    }
}
