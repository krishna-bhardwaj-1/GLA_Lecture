package Assignment_String;

import java.util.Scanner;

public class Form_bigest_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int k=sc.nextInt();
            String[] arr=new String[k];
            for(int i=0;i<k;i++){
                arr[i]=sc.next();
            }
            biggestno(arr);
        }
    }
    public static void biggestno(String[] arr){
        StringBuilder str=new StringBuilder();
        for(int turn=1;turn<arr.length;turn++){
            for(int i=0;i<arr.length-turn;i++){
                if(sort(arr[i],arr[i+1])){
                    String temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            str.append(arr[i]);
        }
        System.out.println(str);
    }
    public static boolean sort(String a,String b){
        String c=a+b;
        String d=b+a;
        if(Long.parseLong(c)>Long.parseLong(d)){
            return false;
        }
        return true;
    }
}
