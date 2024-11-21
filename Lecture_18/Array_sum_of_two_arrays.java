package Lecture_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_sum_of_two_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr1=new int[a];
        for(int i=0;i<a;i++){
            arr1[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int[] arr2=new int[b];
        for(int i=0;i<b;i++){
            arr2[i]=sc.nextInt();
        }
        sum_of_array(arr1,arr2,a,b);
    }
    public static void sum_of_array(int[] arr1, int[] arr2 , int a, int b){
        ArrayList<Integer> ll=new ArrayList<>();
        int carry=0;
        int i=a-1;
        int j=b-1;
        while(i>=0 && j>=0){
            int sum=arr1[i]+arr2[j]+carry;
            ll.add(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        while(i>=0){
            int sum=arr1[i]+carry;
            ll.add(sum%10);
            carry=sum/10;
            i--;
        }
        while (j>=0){
            int sum=arr2[j]+carry;
            ll.add(sum%10);
            carry=sum/10;
            j--;
        }
        if(carry>0){
            ll.add(carry);
        }
        for(int k=ll.size()-1;k>=0;k--){
            System.out.print(ll.get(k)+", ");
        }
        System.out.print("END");
    }
}
