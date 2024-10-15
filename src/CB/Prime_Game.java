package CB;
import java.util.*;
public class Prime_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(a=a+1;a<b;a++) {
            int c=0;
            for(int i=2;i<=(a/2);i++) {
                if(a%i==0) c++;
            }
            if(c==0)System.out.print(a+" ");
        }
    }
}
