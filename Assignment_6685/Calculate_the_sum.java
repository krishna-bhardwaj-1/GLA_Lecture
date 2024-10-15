package Assignment_6685;
import java.util.*;
public class Calculate_the_sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int[] ar=new int[x];
        int[] ar2=new int[x];
        for(int i=0;i<x;i++) {
            ar[i]=in.nextInt();
        }
        int sum=0;
        int p=in.nextInt();
        if(p==0) {
            ar2=ar;
        }
        while(p-->0) {
            int g=in.nextInt();
            g=g%x;
            for(int i=0;i<x;i++) {
                int m=i-g;
                if(i-g<0) {
                    m=x+(i-g);
                }
                ar2[i]=ar[i]+ar[m];
            }
            for(int i=0;i<x;i++) {

                ar[i]=ar2[i];
            }
        }
        for(int i=0;i<x;i++) {
            sum+=ar2[i];
        }
        sum=sum%(1000000007);
        System.out.println(sum);
    }
}
