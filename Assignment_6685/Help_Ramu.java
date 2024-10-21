package Assignment_6685;
import java.util.*;
public class Help_Ramu_2 {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int t=in.nextInt();
            while(t-->0){
                int a=0;
                int b=0;
                int[] cs=new int[4];
                for(int i=0;i<4;i++){
                    cs[i]=in.nextInt();
                }
                int n=in.nextInt();
                int m=in.nextInt();
                int[] rs=new int[n];
                for(int i=0;i<n;i++){
                    rs[i]=in.nextInt();
                    a+=Math.min(rs[i]*cs[0],cs[1]);
                }
                a=Math.min(a,cs[2]);
                int[]cb=new int[m];
                for(int i=0;i<m;i++){
                    cb[i]=in.nextInt();
                    b+=Math.min(cb[i]*cs[0],cs[1]);
                }
                b=Math.min(b,cs[2]);
                b=Math.min(b+a,cs[3]);
                System.out.println(b);


            }
        }
}
