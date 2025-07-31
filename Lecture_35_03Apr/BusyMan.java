package Lecture_35_03Apr;

import java.util.*;

class Pair{
    int val1;
    int val2;

    public Pair(int val1,int val2){
        this.val1=val1;
        this.val2=val2;
    }
}
public class BusyMan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pair[] arr=new Pair[n];
        for (int i=0;i<n;i++){
            int val1=sc.nextInt();
            int val2=sc.nextInt();
            arr[i]=new Pair(val1,val2);
        }


        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.val2-o2.val2;
            }
        });

        int activities=1;
        int end=arr[0].val2;
        for (int i=1;i<arr.length;i++){
            if(arr[i].val1>=end){
                activities++;
                end=arr[i].val2;
            }
        }
        System.out.println(activities);
    }
}
