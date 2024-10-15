package Assignment_6498;

import java.util.Scanner;

public class oddplace_and_evenplacedigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s1=0,s2=0,i=1;
        while(n>0){
            int rem=n%10;
            n/=10;
            if(i%2!=0) s1+=rem;
            else s2+=rem;
            i++;
        }
        System.out.print(s1+"\n"+s2);
    }
}
