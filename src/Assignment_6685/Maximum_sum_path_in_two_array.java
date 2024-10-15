package Assignment_6685;

import java.util.Scanner;

public class Maximum_sum_path_in_two_array {
public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        while(p-->0) {
            int a=in.nextInt();
            int b=in.nextInt();
            int[] ar=new int[a];
            for(int i=0;i<a;i++) {
                ar[i]=in.nextInt();
            }
            int[] br=new int[b];
            for(int i=0;i<b;i++) {
                br[i]=in.nextInt();
            }
            int total=0;
            int m=0;
            int[]c=common(ar,br,a,b);
            int d=0;
            int e=0;
            for(int i=0;i<c.length;i+=2) {

                int z=sum(ar,br,d,c[i],e,c[i+1]);
                total+=z;
                d=c[i];
                e=c[i+1];
            }
            System.out.println(total);
        }
    }
    public static int[] common(int[] ar,int[] br,int a,int b) {
        int[] c=new int[2*(a>b?b:a)];
        int d=0;
        for(int i=0;i<ar.length;i++) {
            for(int j=0;j<b;j++) {
                if(ar[i]==br[j]) {
                    c[d]=i;
                    d++;
                    c[d]=j;
                    d++;
                }

            }
        }
        c[d]=a;
        c[d+1]=b;
        return c;
    }
    public static int sum(int[] ar,int[] br,int s,int e,int s2,int e2) {
        int p=0;
        int f=0;
        int sum=0;
        for(int i=s;i<e;i++) {
            p+=ar[i];
        }
        for(int j=s2;j<e2;j++) {
            f+=br[j];
        }
        return p>f?p:f;
    }
}
