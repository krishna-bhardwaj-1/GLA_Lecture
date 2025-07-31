package codeforces;

import java.util.Scanner;

public class newworld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int p=sc.nextInt();

            int min=-p;
            int max=p;
            if(k>n*p || k<n*-p){
                System.out.println(-1);
                continue;
            }
            if(k==0){
                System.out.println(0);
                continue;
            }
            int currsum=0;
            int c=0;
            for(int i=0;i<n;i++){
                int remsum=k-currsum;
                int val=Math.max(min,Math.min(max,remsum));
                currsum+=val;
                c++;
                if(currsum==k){
                    break;
                }
            }
            System.out.println(c);
        }
    }
}
