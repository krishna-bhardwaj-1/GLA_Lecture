package Assignment_6685;

import java.util.Scanner;

public class Pair_of_roses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int turn=sc.nextInt();
        while(turn>0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Sort(arr);
            int tar = sc.nextInt();
            int max=tar;
            int a=0,b=0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == tar){
                        if(max>arr[j]-arr[i]) {
                            a = arr[i];
                            b = arr[j];
                            max = arr[j]-arr[i];
                        }
                    }
                }
            }
            System.out.print("Deepak should buy roses whose prices are "+a+" and "+b+".");
            turn--;
        }
    }
    public static void Sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
