package Assignment_6498;

import java.util.Scanner;

public class simple_input {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        while(true){
            int a=sc.nextInt();
            sum+=a;
            if(sum>=0) System.out.println(a);
            else break;
        }
    }
}
