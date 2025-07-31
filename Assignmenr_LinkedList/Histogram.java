package Assignmenr_LinkedList;

import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Area(arr));
    }
    private static int Area(int[] arr){
        int area=0;
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            while (!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    area= Math.max(area,h*r);
                }
                else {
                    int l=st.peek();
                    area=Math.max(area,h*(r-l-1));
                }
            }
            st.push(i);
        }

        int r=n;
        while (!st.isEmpty()){
            int h=arr[st.pop()];
            if(st.isEmpty()){
                area= Math.max(area,h*r);
            }
            else {
                int l=st.peek();
                area=Math.max(area,h*(r-l-1));
            }
        }
        return area;
    }
}
