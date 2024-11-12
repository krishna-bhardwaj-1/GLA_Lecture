package Assignment_2darray_binarysearch;

import java.util.Scanner;

public class piyush_and_magical_park {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int s=sc.nextInt();
        String[][] arr=new String[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.next();
            }
        }
        int strngth=Strength(arr,s,k);
        if(k<=strngth){
            System.out.print("Yes"+"\n"+strngth+"\n");
        }
        else System.out.print("No");

    }
    public static int Strength(String[][] arr,int p,int k){
        int S=p;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(S<k) return -1;
                if(arr[i][j].equals(".")){
                    S-=2;
                }
                else if(arr[i][j].equals("*")){
                    S+=5;
                }
                else break;
                if (j < arr[0].length - 1) S--;
            }
        }
        return S;
    }
}
