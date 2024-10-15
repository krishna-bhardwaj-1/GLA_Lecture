package Assignment_6498;

import java.util.Scanner;

public class inverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=1,sum=0;
        while(n>0){
            int rem=n%10;
            sum+=pos*Math.pow(10,rem-1);
            pos++;
            n/=10;
        }
        System.out.println(sum);
    }
}
