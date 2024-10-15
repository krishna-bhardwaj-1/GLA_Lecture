package Assignment_6685;

import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] arry=new int[m];
        for(int g=0;g<m;g++)
            arry[g]=sc.nextInt();
        bubblesort(arry);
        for(int g=0;g<m;g++){
            System.out.println(arry[g]);
        }

    }
    public static void bubblesort(int[] arry){
        for(int k=1;k<arry.length;k++){
            for(int i=0;i<arry.length-k;i++){
                if(arry[i]>arry[i+1]){
                    int temp=arry[i];
                    arry[i]=arry[i+1];
                    arry[i+1]=temp;
                }
            }
        }
    }
}
