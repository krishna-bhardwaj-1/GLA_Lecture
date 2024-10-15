package Assignment_6685;

import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] arry=new int[m];
        for(int g=0;g<m;g++)
            arry[g]=sc.nextInt();
        Insertionsort(arry);
        for(int g=0;g<m;g++)
            System.out.println(arry[g]);
    }
    public static void Insertionsort(int[] arry){
        for(int i=1;i<arry.length;i++){
            Insertoncorectpos(arry,i);
        }
    }
    public static void Insertoncorectpos(int[] arry,int idx){
        int item=arry[idx];
        int j=idx-1;
        while(j>=0&&arry[j]>item){
            arry[j+1]=arry[j];
            arry[j]=item;
            j--;
        }
    }
}
