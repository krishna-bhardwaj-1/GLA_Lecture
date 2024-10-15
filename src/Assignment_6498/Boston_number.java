package Assignment_6498;

import java.util.Scanner;

public class Boston_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum_primefact(n));
        System.out.println(sumdigit(n));
    }
    public static int sum_primefact(int n){
        int sum=0;
        while(n!=1){
            int i=2;
            while(i<=n){
                int rem=n%i;
                if(rem%i==0){
                    if(i>9){
                        int c=i;
                        while(c>0){
                            int r=c%10;
                            sum+=r;
                            c/=10;
                        }
                    }
                    else{
                        sum+=i;
                    }
                    n/=i;
                }
                else i++;

            }
        }
        return sum;
    }
    public static int sumdigit(int n){
        int sum2=0;
        while(n>0) {
            int rem = n % 10;
            sum2+=rem;
            n/=10;
        }
        return sum2;
    }
}
