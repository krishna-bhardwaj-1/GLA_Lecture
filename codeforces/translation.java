package codeforces;

import java.util.Scanner;

public class translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] fre=new int[26];
        String a=sc.next();
        String b=sc.next();
        for(char ch:a.toCharArray()){
            fre[ch-'a']++;
        }
        for(char ch:b.toCharArray()){
            fre[ch-'a']--;
        }
        boolean c=true;
        for(int i:fre){
            if(i!=0){
                c=false;
                break;
            }
        }
        if(c==false){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
