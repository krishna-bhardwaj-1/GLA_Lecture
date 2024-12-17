package Leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class sort_list_alphabetically {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> fre=new HashMap<>();
        for(int num:arr){
            fre.put(num,fre.getOrDefault(num,0)+1);
        }
        HashMap<Integer,Integer> repeat=new HashMap<>();
        for(int key:fre.keySet()){
            if(fre.get(key)>1){
                repeat.put(key,fre.get(key));
            }
        }
        System.out.print(repeat);
    }
}
