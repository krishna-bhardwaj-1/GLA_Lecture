package Assignment_6685;

import java.util.Scanner;

public class Von_Neumann_Loves_Library {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] arry=new int[m];
        for(int g=0;g<m;g++){
            arry[g]=sc.nextInt();
        }
        decimal(arry);
        for(int g=0;g<m;g++)
            System.out.println(arry[g]);
    }
    public static void decimal(int[] arry){
        for(int i=0;i<arry.length;i++){
            int sum=0;
            int mul=1;
            while(arry[i]>0){
                int rem=arry[i]%10;
                sum+=rem*mul;
                arry[i]/=10;
                mul*=2;
            }
            arry[i]=sum;
        }
    }
}
