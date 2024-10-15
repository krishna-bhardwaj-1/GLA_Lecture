package Assignment_1;
import java.util.Scanner;

public class odd_even_placesum {
    public static void main(String[] args) {
        //2635
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c,s1=0,s2=0,i=1;
        while(n>0){
            c=n%10;
            n=n/10;
            if(i%2!=0) s1+=c;
            else s2+=c;
            i++;
        }
        System.out.print(s1+"\n"+s2);
    }
}
