package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class traingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        for (int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        if((arr[0]+arr[1]>arr[2])||(arr[1]+arr[2]>arr[3])) System.out.println("TRIANGLE");
        else if((arr[0]+arr[1]==arr[2])||(arr[1]+arr[2]==arr[3])) System.out.println("SEGMENT");
        else System.out.println("IMPOSSIBLE");
    }
}
