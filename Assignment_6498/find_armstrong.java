package Assignment_6498;

import java.util.Scanner;

public class find_armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(Armstrong_number(i)==true) System.out.println(i);
        }

    }
    public static boolean Armstrong_number(int n){
        int p=n,sum=0;
        int len=Count_of_digit(n);
        while(n>0){
            int rem=n%10;
            sum+=Math.pow(rem,len);
            n/=10;
        }
        return (sum==p);
    }
    public static int Count_of_digit(int n){
        int i=0;
        while (n>0){
            i++;
            n/=10;
        }
        return i;
    }
}
