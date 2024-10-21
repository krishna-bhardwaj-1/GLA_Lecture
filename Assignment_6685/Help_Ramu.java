package Assignment_6685;
import java.util.*;
public class Help_Ramu {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int c=1;
        while(c++<=p){
            int t1=sc.nextInt();
            int t2=sc.nextInt();
            int t3=sc.nextInt();
            int t4=sc.nextInt();
            int n=sc.nextInt();
            int m=sc.nextInt();
            int totalr=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                totalr+=Math.min(a*t1,t2);
            }
            totalr=Math.min(totalr,t3);
            int totalc=0;
            for(int i=0;i<m;i++){
                int a=sc.nextInt();
                totalc+=Math.min(a*t1,t2);
            }
            totalc=Math.min(totalc,t3);
            System.out.println(Math.min((totalc+totalr),t4));
        }
    }
}
