package practice_endsem_3rd;

import java.util.Scanner;

public class inverse_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=1;
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum+=(int)(pos*Math.pow(10,rem-1));
            n/=10;
            pos++;
        }
        System.out.println(sum);
    }

}
