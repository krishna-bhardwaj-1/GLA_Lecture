package Assignment_1;

import java.util.Scanner;

public class max_value_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=a[0];
        for(i=0;i<n;i++) {
            if(c<a[i]) c=a[i];
        }
        System.out.print(c);
    }
}
