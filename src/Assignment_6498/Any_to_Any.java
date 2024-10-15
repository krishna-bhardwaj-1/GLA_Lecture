package Assignment_6498;

import java.util.Scanner;

public class Any_to_Any {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sb=sc.nextInt();
        int db=sc.nextInt();
        int n=sc.nextInt();
        int i=1, sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*i;
            i*=sb;
            n/=10;
        }
        int s=0,mul=1;
        while(sum>0){
            int rem=sum%db;
            s+=rem*mul;
            mul*=10;
            sum/=db;
        }
        System.out.println(s);
    }
}
