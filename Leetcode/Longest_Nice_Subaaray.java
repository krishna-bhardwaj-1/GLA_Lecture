package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Longest_Nice_Subaaray {
    static int c;
    public static void main(String[] args) {
        int[] nums={3,1,5,11,13};
        c=0;
        subset(0,0,nums,new ArrayList<>());
        System.out.println(c);
    }
    private static void subset(int si,int ei, int[] arr, List<Integer> ans){
        while (ei<arr.length){
            //grow
            ans.add(arr[ei]);
            System.out.println(ans);
            //shrink
            while (!nice(ans)){
                ans.remove(0);
                si++;
            }
            c=Math.max(c,ans.size());
            ei++;
        }
    }
    private static boolean nice(List<Integer> arr){
        if(arr.size()==1) return true;
        for(int i=0;i<arr.size()-1;i++){
            for (int j=i+1;j<arr.size();j++){
                if((arr.get(i) & arr.get(j))!=0) return false;
            }
        }
        return true;
    }
}
