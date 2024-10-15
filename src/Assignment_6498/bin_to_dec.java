package Assignment_6498;

import java.util.Scanner;

public class bin_to_dec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1,sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*c;
            n/=10;
            c*=2;
        }
        System.out.println(sum);
    }
}
