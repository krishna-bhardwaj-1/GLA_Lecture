package Assignment_6498;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int i=n.length()-1;
        int sum=0;
        int num= Integer.parseInt(n);
        while(num>0){
            int rem=num%10;
            sum+=rem*Math.pow(10,i);
            num/=10;
            i--;
        }
        System.out.print(sum);
    }
}
