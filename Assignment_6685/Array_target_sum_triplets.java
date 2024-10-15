package Assignment_6685;

import java.util.Scanner;

public class Array_target_sum_triplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Sort(arr);
        int tar=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==tar) System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
                }
            }
        }
    }
    public static void Sort(int[] arr){
        for(int turn=1;turn<arr.length;turn++){
            for(int i=0;i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
}
