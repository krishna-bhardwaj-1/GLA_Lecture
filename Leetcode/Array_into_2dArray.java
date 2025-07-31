package Leetcode;

import java.util.ArrayList;

public class Array_into_2dArray {
    public static void main(String[] args) {
        int[] numss={1,3,4,1,2,3,1};
        System.out.println(sol(numss));
    }
    public static ArrayList<ArrayList<Integer>> sol(int[] numss) {
        ArrayList<Integer> nums=new ArrayList<>();
        for(int n:numss){
            nums.add(n);
        }
        ArrayList<Integer> ll=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        System.out.println(nums);
        while (nums.size()>0){
            for(int i=0;i<nums.size();){
                int no=nums.get(i);
                if(ll.contains(no)){
                    continue;
                }
                else {
                    ll.add(no);
                    nums.remove(no);
                    i++;
                }
            }
            System.out.println("arrrraaayyy"+nums);
            ans.add(ll);
            System.out.println(ll);
            ll.clear();
        }
        return ans;
    }
}
