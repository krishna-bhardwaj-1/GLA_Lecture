package Assignment_1;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,p=0;
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        for(i=0;i<n;i++) {
            if(c==a[i]){
                p=i;
                break;
            }
        }
        if(p>0) System.out.print(p);
        else System.out.print(-1);
    }
}
