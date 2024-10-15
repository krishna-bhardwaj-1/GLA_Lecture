package Assignment_6685;
import java.util.*;
public class Alex_goes_shopping_2 {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int x=in.nextInt();
            int[] ar=new int[x];
            for(int i=0;i<x;i++) {
                ar[i]=in.nextInt();
            }
            int q=in.nextInt();
            while(q-->0) {
                int a=in.nextInt();
                int b=in.nextInt();
                int p=0;
                for(int i=0;i<x;i++) {
                    if(a%ar[i]==0) {
                        p++;
                        System.out.println(p+"**"+a+"**"+ar[i]);
                    }
                }
                if(p>=b) {
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
        System.out.println();
        }
}
