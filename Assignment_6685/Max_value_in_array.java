package Assignment_6685;

import java.util.Scanner;

public class Max_value_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print(max(arr));
    }
    public static int max(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[0]) arr[0]=arr[i];
        }
        return arr[0];
    }
}
