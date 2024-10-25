package codeforces;

import java.util.Scanner;
import java.lang.String;
public class Vlad_and_the_Best_of_Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n>0){
            String st=sc.nextLine();
            char[] arr=st.toCharArray();
            int a=0;
            int b=0;
            for(int i=0;i<arr.length;i++) {
                if (arr[i] == 'A') {
                    a++;
                } else b++;
            }
            char ch=(a>b)?'A':'B';
            System.out.println(ch);
            n--;
        }
    }
}
