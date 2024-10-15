package Assignment_6685;

import java.util.Scanner;

public class Next_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int m=sc.nextInt();
            int[] arr=new int[m];
            for(int i=0;i<m;i++){
                arr[i]=sc.nextInt();
            }
            nextpermutation(arr);
            for(int g=0;g<m;g++)
                System.out.print(arr[g]+" ");
            n--;
        }
    }
    public static void nextpermutation(int[] arr){
        int p=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            Reverse(arr,0,n-1);
            return;
        }
        int q=-1;
        for(int i=n-1;i>p;i--){
            if(arr[i]>arr[p]){
                q=i;
                break;
            }
        }
        //swap p & q
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        //reverse from p+1 to last(n-1)
        Reverse(arr,p+1,n-1);
    }
    public static void Reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}