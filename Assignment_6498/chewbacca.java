package Assignment_6498;

import java.util.Scanner;

public class chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long c=1L,sum=0L;
        while(n>0){
            Long rem=n%10L;
            if(rem>9L-rem) rem=9L-rem;
            if(rem==0L&&n<10L) rem=9L;
            sum+=rem*c;
            c*=10L;
            n/=10L;
        }
        System.out.print(sum);
    }
}
